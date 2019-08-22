package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.StandardTrace;
import com.authorization.privilege.mapper.dsprivilegewrite.ts.StandardTraceWriteMapper;
import com.authorization.privilege.service.ts.StandardTraceWriteService;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.StandardTraceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@Transactional(rollbackFor = Exception.class)
public class StandardTraceWriteServiceImpl implements StandardTraceWriteService {

    @Autowired
    private StandardTraceWriteMapper standardTraceWriteMapper;


    @Override
    public ResultVO<Void> saveStandardTrace(StandardTraceVO standardTraceVO) throws Exception {

        StandardTrace standardTrace = new StandardTrace();
        standardTrace.setCycleCode(standardTraceVO.getCycleCode());
        standardTrace.setNodeCode(standardTraceVO.getNodeCode());
        standardTrace.setTraceCode(standardTraceVO.getTraceCode());
        standardTrace.setTraceNameCn(standardTraceVO.getTraceNameCn());
        standardTrace.setTraceNameEn(standardTraceVO.getTraceNameEn());
        standardTrace.setShowCustomer(standardTraceVO.getShowCustomer());
        standardTrace.setState(standardTraceVO.getState());
        standardTrace.setRemark(standardTraceVO.getRemark());
        standardTrace.setCreateBy(standardTraceVO.getLoginUid());
        standardTrace.setCreateTime(LocalDateTime.now());
        standardTrace.setUpdateBy(standardTraceVO.getLoginUid());
        standardTrace.setUpdateTime(LocalDateTime.now());
        standardTrace.setDeleteTime(0L);
        this.standardTraceWriteMapper.insertSelective(standardTrace);

        return ResultVO.getSuccess("新增标准轨迹成功");
    }


    @Override
    public ResultVO<Void> updateStandardTrace(StandardTraceVO standardTraceVO) throws Exception {

        StandardTrace standardTrace = new StandardTrace();
        standardTrace.setId(standardTraceVO.getId());
        standardTrace.setCycleCode(standardTraceVO.getCycleCode());
        standardTrace.setNodeCode(standardTraceVO.getNodeCode());
        standardTrace.setTraceCode(standardTraceVO.getTraceCode());
        standardTrace.setTraceNameCn(standardTraceVO.getTraceNameCn());
        standardTrace.setTraceNameEn(standardTraceVO.getTraceNameEn());
        standardTrace.setShowCustomer(standardTraceVO.getShowCustomer());
        standardTrace.setState(standardTraceVO.getState());
        standardTrace.setRemark(standardTraceVO.getRemark());
        standardTrace.setUpdateBy(standardTraceVO.getLoginUid());
        standardTrace.setUpdateTime(LocalDateTime.now());
        this.standardTraceWriteMapper.updateByPrimaryKeySelective(standardTrace);

        return ResultVO.getSuccess("修改标准轨迹成功");
    }


    @Override
    public ResultVO<Void> deleteStandardTrace(StandardTraceVO standardTraceVO) throws Exception {

        StandardTraceVO newStandardTraceVO = new StandardTraceVO();
        newStandardTraceVO.setId(standardTraceVO.getId());
        newStandardTraceVO.setStids(standardTraceVO.getStids());
        newStandardTraceVO.setDeleteTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        this.standardTraceWriteMapper.updateStandardTraceVO(newStandardTraceVO);

        return ResultVO.getSuccess("删除标准轨迹成功");
    }
}
