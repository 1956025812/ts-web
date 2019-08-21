package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceNode;
import com.authorization.privilege.mapper.dsprivilegeread.ts.TraceNodeReadMapper;
import com.authorization.privilege.service.ts.TraceNodeReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceNodeVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceNodeReadServiceImpl implements TraceNodeReadService {

    @Autowired
    private TraceNodeReadMapper traceNodeReadMapper;

    @Override
    public ResultVO<PageVO<TraceNodeVO>> selectTraceNodePage(TraceNodeVO traceNodeVO) throws Exception {

        PageHelper.startPage(traceNodeVO.getCurrentPage(), traceNodeVO.getPageSize());
        List<TraceNodeVO> traceNodeVOList = this.traceNodeReadMapper.selectTraceNodeVOList(traceNodeVO);

        PageInfo<TraceNodeVO> pageInfo = new PageInfo<>(traceNodeVOList);
        PageVO<TraceNodeVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询轨迹节点分页列表成功", pageVO);
    }


    @Override
    public ResultVO<TraceNodeVO> selectTraceNodeVODetail(TraceNodeVO traceNodeVO) throws Exception {

        TraceNode traceNode = this.traceNodeReadMapper.selectByPrimaryKey(traceNodeVO.getId());

        return ResultVO.getSuccess("查询轨迹节点详情成功", traceNode);
    }
}
