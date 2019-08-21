package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceNode;
import com.authorization.privilege.mapper.dsprivilegewrite.ts.TraceNodeWriteMapper;
import com.authorization.privilege.service.ts.TraceNodeWriteService;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceNodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@Transactional(rollbackFor = Exception.class)
public class TraceNodeWriteServiceImpl implements TraceNodeWriteService {

    @Autowired
    private TraceNodeWriteMapper traceNodeWriteMapper;


    @Override
    public ResultVO<Void> saveTraceNode(TraceNodeVO traceNodeVO) throws Exception {

        TraceNode traceNode = new TraceNode();
        traceNode.setCycleCode(traceNodeVO.getCycleCode());
        traceNode.setNodeCode(traceNodeVO.getNodeCode());
        traceNode.setNodeNameCn(traceNodeVO.getNodeNameEn());
        traceNode.setNodeNameEn(traceNodeVO.getNodeNameEn());
        traceNode.setRemark(traceNodeVO.getRemark());
        traceNode.setCreateBy(traceNodeVO.getLoginUid());
        traceNode.setCreateTime(LocalDateTime.now());
        traceNode.setUpdateBy(traceNodeVO.getLoginUid());
        traceNode.setUpdateTime(LocalDateTime.now());
        traceNode.setDeleteTime(0L);
        this.traceNodeWriteMapper.insertSelective(traceNode);

        return ResultVO.getSuccess("新增轨迹节点成功");
    }


    @Override
    public ResultVO<Void> updateTraceNode(TraceNodeVO traceNodeVO) throws Exception {

        TraceNode traceNode = new TraceNode();
        traceNode.setId(traceNodeVO.getId());
        traceNode.setCycleCode(traceNodeVO.getCycleCode());
        traceNode.setNodeCode(traceNodeVO.getNodeCode());
        traceNode.setNodeNameCn(traceNodeVO.getNodeNameEn());
        traceNode.setNodeNameEn(traceNodeVO.getNodeNameEn());
        traceNode.setRemark(traceNodeVO.getRemark());
        traceNode.setUpdateBy(traceNodeVO.getLoginUid());
        traceNode.setUpdateTime(LocalDateTime.now());
        this.traceNodeWriteMapper.updateByPrimaryKeySelective(traceNode);

        return ResultVO.getSuccess("修改轨迹节点成功");
    }


    @Override
    public ResultVO<Void> deleteTraceNode(TraceNodeVO tracNodeVO) throws Exception {

        TraceNodeVO newTraceNodeVO = new TraceNodeVO();
        newTraceNodeVO.setId(tracNodeVO.getId());
        newTraceNodeVO.setTnids(tracNodeVO.getTnids());
        newTraceNodeVO.setDeleteTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        this.traceNodeWriteMapper.updateTraceNodeVO(newTraceNodeVO);

        return ResultVO.getSuccess("删除轨迹节点成功");
    }
}
