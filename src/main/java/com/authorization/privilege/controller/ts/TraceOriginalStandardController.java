package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.TraceOriginalStandardReadService;
import com.authorization.privilege.service.ts.TraceOriginalStandardWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"TraceOriginalStandardController"}, description = "原始轨迹标准轨迹映射Controller")
@RestController
@RequestMapping("/traceoriginalstandard")
public class TraceOriginalStandardController extends BaseController {

    @Autowired
    private TraceOriginalStandardReadService traceOriginalStandardReadService;
    @Autowired
    private TraceOriginalStandardWriteService traceOriginalStandardWriteService;


    @ApiOperation("查询原始轨迹标准轨迹映射分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "logisticsAgentCode", value = "物流商编号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "logisticsMethodCode", value = "物流方式编号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "conditionDesc", value = "条件描述", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "standardTraceCode", value = "结果-标准轨迹代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<TraceOriginalStandardVO>> selectTraceOriginalStandardVOPage(@ApiIgnore TraceOriginalStandardVO traceOriginalStandardVO) throws Exception {
        return this.traceOriginalStandardReadService.selectTraceOriginalStandardVOPage(traceOriginalStandardVO);
    }


    @ApiOperation("删除原始轨迹标准轨迹映射")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "原始轨迹标准轨迹映射主键ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "wstids", value = "原始轨迹标准轨迹映射主键ID集合", required = false)
    })
    @PostMapping("/delete")
    public ResultVO<Void> deleteTraceOriginalStandard(@ApiIgnore @RequestBody TraceOriginalStandardVO traceOriginalStandardVO) throws Exception {
        return this.traceOriginalStandardWriteService.deleteTraceOriginalStandard(traceOriginalStandardVO);
    }


}
