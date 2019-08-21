package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.TraceNodeReadService;
import com.authorization.privilege.service.ts.TraceNodeWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceNodeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"TraceNodeController"}, description = "轨迹节点Controller")
@RestController
@RequestMapping("/tracenode")
public class TraceNodeController extends BaseController {

    @Autowired
    private TraceNodeReadService traceNodeReadService;
    @Autowired
    private TraceNodeWriteService traceNodeWriteService;


    @ApiOperation("查询轨迹节点分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "nodeCn", value = "节点中文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "nodeEn", value = "节点英文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "修改开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "结束结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<TraceNodeVO>> selectTraceNodePage(@ApiIgnore TraceNodeVO traceNodeVO) throws Exception {
        return this.traceNodeReadService.selectTraceNodePage(traceNodeVO);
    }


    @ApiOperation("查询轨迹节点详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "id", value = "轨迹节点ID", required = true)
    })
    @GetMapping("/detail")
    public ResultVO<TraceNodeVO> selectTraceCycleVODetail(@ApiIgnore TraceNodeVO traceNodeVO) throws Exception {
        return this.traceNodeReadService.selectTraceNodeVODetail(traceNodeVO);
    }


    @ApiOperation("新增轨迹节点")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCn", value = "节点中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeEn", value = "节点英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "节点用途描述", required = false)
    })
    @PostMapping("/save")
    public ResultVO<Void> saveTraceNode(@ApiIgnore @RequestBody TraceNodeVO traceNodeVO) throws Exception {
        return this.traceNodeWriteService.saveTraceNode(traceNodeVO);
    }


    @ApiOperation("修改轨迹节点")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "节点主键", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCn", value = "节点中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeEn", value = "节点英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "节点用途描述", required = false)
    })
    @PostMapping("/update")
    public ResultVO<Void> updateTraceNode(@ApiIgnore @RequestBody TraceNodeVO traceNodeVO) throws Exception {
        return this.traceNodeWriteService.updateTraceNode(traceNodeVO);
    }


    @ApiOperation("删除轨迹节点")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "节点主键ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "tnids", value = "节点主键ID集合", required = false)
    })
    @PostMapping("/delete")
    public ResultVO<Void> deleteTraceNode(@ApiIgnore @RequestBody TraceNodeVO traceNodeVO) throws Exception {
        return this.traceNodeWriteService.deleteTraceNode(traceNodeVO);
    }


}
