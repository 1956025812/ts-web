package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceCycle;
import com.authorization.privilege.mapper.dsprivilegewrite.ts.TraceCycleWriteMapper;
import com.authorization.privilege.service.ts.TraceCycleWriteService;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Transactional(rollbackFor = Exception.class)
@Service
public class TraceCycleWriteServiceImpl implements TraceCycleWriteService {

    @Autowired
    private TraceCycleWriteMapper traceCycleWriteMapper;


    @Override
    public ResultVO<Void> saveTraceCycle(TraceCycleVO traceCycleVO) throws Exception {

        TraceCycle traceCycle = new TraceCycle();
        traceCycle.setCycleCode(traceCycleVO.getCycleCode());
        traceCycle.setCycleNameCn(traceCycleVO.getCycleNameCn());
        traceCycle.setCycleNameEn(traceCycleVO.getCycleNameEn());
        traceCycle.setRemark(traceCycleVO.getRemark());
        traceCycle.setCreateBy(traceCycleVO.getLoginUid());
        traceCycle.setCreateTime(LocalDateTime.now());
        traceCycle.setUpdateBy(traceCycleVO.getLoginUid());
        traceCycle.setUpdateTime(LocalDateTime.now());
        traceCycle.setDeleteTime(0L);
        this.traceCycleWriteMapper.insertSelective(traceCycle);

        return ResultVO.getSuccess("新增轨迹环节成功");
    }


    @Override
    public ResultVO<Void> updateTraceCycle(TraceCycleVO traceCycleVO) throws Exception {

        TraceCycle traceCycle = new TraceCycle();
        traceCycle.setId(traceCycleVO.getId());
        traceCycle.setCycleCode(traceCycleVO.getCycleCode());
        traceCycle.setCycleNameCn(traceCycleVO.getCycleNameCn());
        traceCycle.setCycleNameEn(traceCycleVO.getCycleNameEn());
        traceCycle.setRemark(traceCycleVO.getRemark());
        traceCycle.setUpdateBy(traceCycleVO.getLoginUid());
        traceCycle.setUpdateTime(LocalDateTime.now());
        this.traceCycleWriteMapper.updateByPrimaryKeySelective(traceCycle);

        return ResultVO.getSuccess("修改轨迹环节成功");
    }


    @Override
    public ResultVO<Void> deleteTraceCycle(TraceCycleVO traceCycleVO) throws Exception {

        TraceCycleVO newTraceCycleVO = new TraceCycleVO();
        newTraceCycleVO.setId(traceCycleVO.getId());
        newTraceCycleVO.setTcids(traceCycleVO.getTcids());
        newTraceCycleVO.setDeleteTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        this.traceCycleWriteMapper.updateTraceCycleVO(newTraceCycleVO);

        return ResultVO.getSuccess("删除轨迹成功");
    }
}
