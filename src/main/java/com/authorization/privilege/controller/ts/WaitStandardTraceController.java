package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.WaitStandardTraceReadService;
import com.authorization.privilege.service.ts.WaitStandardTraceWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"WaitStandardTraceController"}, description = "待标准化轨迹Controller")
@RestController
@RequestMapping("/waitstandardtrace")
public class WaitStandardTraceController extends BaseController {

    @Autowired
    private WaitStandardTraceReadService waitStandardTraceReadService;
    @Autowired
    private WaitStandardTraceWriteService waitStandardTraceWriteService;


    @ApiOperation("查询待标准化轨迹分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "logisticsMainNo", value = "物流主单号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "agentNo", value = "服务商单号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "logisticsProductNo", value = "物流产品代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<WaitStandardTraceVO>> selectWaitStandardTraceVOPage(@ApiIgnore WaitStandardTraceVO waitStandardTraceVO) throws Exception {
        return this.waitStandardTraceReadService.selectWaitStandardTraceVOPage(waitStandardTraceVO);
    }


    @ApiOperation("删除待标准化轨迹")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "待标准化轨迹主键ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "wstids", value = "待标准化轨迹主键ID集合", required = false)
    })
    @PostMapping("/delete")
    public ResultVO<Void> deleteWaitStandardTrace(@ApiIgnore @RequestBody WaitStandardTraceVO waitStandardTraceVO) throws Exception {
        return this.waitStandardTraceWriteService.deleteWaitStandardTrace(waitStandardTraceVO);
    }


}
