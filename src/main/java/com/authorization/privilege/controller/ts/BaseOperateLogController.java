package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.BaseOperateLogReadService;
import com.authorization.privilege.service.ts.BaseOperateLogWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.BaseOperateLogVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"BaseOperateLogController"}, description = "基础日志Controller")
@RestController
@RequestMapping("/baseoperatelog")
public class BaseOperateLogController extends BaseController {

    @Autowired
    private BaseOperateLogReadService baseOperateLogReadService;
    @Autowired
    private BaseOperateLogWriteService baseOperateLogWriteService;


    @ApiOperation("查询基础日志分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "belongType", value = "类型：1：轨迹环节，2：轨迹节点，3：标准轨迹", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "thirdRecordId", value = "操作记录ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "createBy", value = "操作人", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "remark", value = "操作描述", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "操作开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "操作结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<BaseOperateLogVO>> selectBaseOperateLogVOPage(@ApiIgnore BaseOperateLogVO baseOperateLogVO) throws Exception {
        return this.baseOperateLogReadService.selectBaseOperateLogVOPage(baseOperateLogVO);
    }


}
