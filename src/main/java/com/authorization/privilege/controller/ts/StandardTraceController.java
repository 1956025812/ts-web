package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.StandardTraceReadService;
import com.authorization.privilege.service.ts.StandardTraceWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.StandardTraceVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"StandardTraceController"}, description = "标准轨迹Controller")
@RestController
@RequestMapping("/standardtrace")
public class StandardTraceController extends BaseController {

    @Autowired
    private StandardTraceReadService standardTraceReadService;
    @Autowired
    private StandardTraceWriteService standardTraceWriteService;


    @ApiOperation("查询标准轨迹分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "traceCode", value = "标准轨迹代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "traceNameCn", value = "标准轨迹中文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "traceNameEn", value = "标准轨迹英文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "修改开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "结束结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<TraceCycleVO>> selectStandardTraceVOPage(@ApiIgnore StandardTraceVO standardTraceVO) throws Exception {
        return this.standardTraceReadService.selectStandardTraceVOPage(standardTraceVO);
    }


    @ApiOperation("查询标准轨迹详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "id", value = "标准轨迹ID", required = true)
    })
    @GetMapping("/detail")
    public ResultVO<TraceCycleVO> selectStandardTraceDetail(@ApiIgnore StandardTraceVO standardTraceVO) throws Exception {
        return this.standardTraceReadService.selectStandardTraceDetail(standardTraceVO);
    }


    @ApiOperation("新增标准轨迹")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceCode", value = "标准轨迹代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceNameCn", value = "标准轨迹中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceNameEn", value = "标准轨迹英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "state", value = "状态：0异常, 1正常", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "showCustomer", value = "是否显示给客户：0：N，1：Y", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "环节用途描述", required = false)
    })
    @PostMapping("/save")
    public ResultVO<Void> saveStandardTrace(@ApiIgnore @RequestBody StandardTraceVO standardTraceVO) throws Exception {
        return this.standardTraceWriteService.saveStandardTrace(standardTraceVO);
    }


    @ApiOperation("修改标准轨迹")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "标准轨迹ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "nodeCode", value = "节点代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceCode", value = "标准轨迹代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceNameCn", value = "标准轨迹中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "traceNameEn", value = "标准轨迹英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "state", value = "状态：0异常, 1正常", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "showCustomer", value = "是否显示给客户：0：N，1：Y", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "环节用途描述", required = false)
    })
    @PostMapping("/update")
    public ResultVO<Void> updateStandardTrace(@ApiIgnore @RequestBody StandardTraceVO standardTraceVO) throws Exception {
        return this.standardTraceWriteService.updateStandardTrace(standardTraceVO);
    }


    @ApiOperation("删除标准轨迹")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "标准轨迹主键ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "stids", value = "标准轨迹主键ID集合", required = false)
    })
    @PostMapping("/delete")
    public ResultVO<Void> deleteStandardTrace(@ApiIgnore @RequestBody StandardTraceVO standardTraceVO) throws Exception {
        return this.standardTraceWriteService.deleteStandardTrace(standardTraceVO);
    }


}
