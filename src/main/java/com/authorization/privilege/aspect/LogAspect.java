package com.authorization.privilege.aspect;

import com.authorization.privilege.vo.ResultVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 日志切面类
 */
@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // ..表示包及子包 该方法代表controller层的所有方法   注意： BaseController中的方法不需要执行切面
    @Pointcut("execution(public * com.authorization.privilege.controller..*.*(..)) "
            + "&& !execution(public * com.authorization.privilege.controller.BaseController.*(..))"
    )
    public void ControllerLog() {
    }



    @Before("ControllerLog()")
    public void LogRequestInfo(JoinPoint joinPoint) throws Exception {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        StringBuffer requestLog = new StringBuffer();
        requestLog.append("请求信息：")
                .append("URL = {" + request.getRequestURI() + "},\t")
                .append("HTTP_METHOD = {" + request.getMethod() + "},\t")
                .append("IP = {" + request.getRemoteAddr() + "},\t")
                .append("CLASS_METHOD = {" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "},\t");

        if (joinPoint.getArgs().length == 0) {
            requestLog.append("请求参数 = {} ");
        } else {
            if (joinPoint.getArgs()[0] instanceof MultipartFile || joinPoint.getArgs()[0] instanceof MultipartFile[]) {
                requestLog.append("请求参数为文件上传，参数忽略");
            } else {
                requestLog.append("请求参数 = " + new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                        .writeValueAsString(joinPoint.getArgs()[0]) + "");
            }
        }

        logger.info(requestLog.toString());
    }


    @AfterReturning(returning = "resultVO", pointcut = "ControllerLog()")
    public void logResultVOInfo(ResultVO resultVO) throws Exception {
        logger.info("请求结果：" + resultVO.getCode() + "\t" + resultVO.getMsg());
    }

}