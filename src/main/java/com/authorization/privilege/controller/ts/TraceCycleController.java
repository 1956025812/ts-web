package com.authorization.privilege.controller.ts;

import com.authorization.privilege.controller.BaseController;
import com.authorization.privilege.service.ts.TraceCycleReadService;
import com.authorization.privilege.service.ts.TraceCycleWriteService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"TraceCycleController"}, description = "轨迹环节Controller")
@RestController
@RequestMapping("/tracecycle")
public class TraceCycleController extends BaseController {

    @Autowired
    private TraceCycleReadService traceCycleReadService;
    @Autowired
    private TraceCycleWriteService traceCycleWriteService;


    @ApiOperation("查询轨迹环节分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "cycleNameCn", value = "环节中文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "cycleNameEn", value = "环节英文名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "startTime", value = "修改开始时间", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endTime", value = "结束结束时间", required = false)
    })
    @GetMapping("/page")
    public ResultVO<PageVO<TraceCycleVO>> selectTraceCycleVOPage(@ApiIgnore TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleReadService.selectTraceCycleVOPage(traceCycleVO);
    }


    @ApiOperation("查询轨迹环节详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "id", value = "轨迹环节ID", required = false)
    })
    @GetMapping("/detail")
    public ResultVO<TraceCycleVO> selectTraceCycleVODetail(@ApiIgnore TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleReadService.selectTraceCycleVODetail(traceCycleVO);
    }


    @ApiOperation("查询轨迹环节列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "id", value = "轨迹环节ID", required = false)
    })
    @GetMapping("/list")
    public ResultVO<TraceCycleVO> selectTraceCycleVOList(@ApiIgnore TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleReadService.selectTraceCycleVOList(traceCycleVO);
    }


    @ApiOperation("新增轨迹环节")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleNameCn", value = "环节中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleNameEn", value = "环节英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "环节用途描述", required = false)
    })
    @PostMapping("/save")
    public ResultVO<Void> saveTraceCycle(@ApiIgnore @RequestBody TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleWriteService.saveTraceCycle(traceCycleVO);
    }


    @ApiOperation("修改轨迹环节")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "环节主键", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleCode", value = "环节代码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleNameCn", value = "环节中文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "cycleNameEn", value = "环节英文名称", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "remark", value = "环节用途描述", required = false)
    })
    @PostMapping("/update")
    public ResultVO<Void> updateTraceCycle(@ApiIgnore @RequestBody TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleWriteService.updateTraceCycle(traceCycleVO);
    }


    @ApiOperation("删除轨迹环节")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "loginUid", value = "登录用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "id", value = "环节主键ID", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "tcids", value = "环节主键ID集合", required = false)
    })
    @PostMapping("/delete")
    public ResultVO<Void> deleteTraceCycle(@ApiIgnore @RequestBody TraceCycleVO traceCycleVO) throws Exception {
        return this.traceCycleWriteService.deleteTraceCycle(traceCycleVO);
    }


}
