package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegewrite.ts.WaitStandardTraceWriteMapper;
import com.authorization.privilege.service.ts.WaitStandardTraceWriteService;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@Transactional(rollbackFor = Exception.class)
public class WaitStandardTraceWriteServiceImpl implements WaitStandardTraceWriteService {

    @Autowired
    private WaitStandardTraceWriteMapper waitStandardTraceWriteMapper;


    @Override
    public ResultVO<Void> deleteWaitStandardTrace(WaitStandardTraceVO waitStandardTraceVO) throws Exception {

        WaitStandardTraceVO newWaitStandardTraceVO = new WaitStandardTraceVO();
        newWaitStandardTraceVO.setId(waitStandardTraceVO.getId());
        newWaitStandardTraceVO.setWstids(waitStandardTraceVO.getWstids());
        newWaitStandardTraceVO.setDeleteTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        this.waitStandardTraceWriteMapper.deleteWaitStandardTrace(newWaitStandardTraceVO);

        return ResultVO.getSuccess("删除带标准化轨迹成功");
    }
}
