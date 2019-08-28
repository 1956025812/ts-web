package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegewrite.ts.TraceOriginalStandardWriteMapper;
import com.authorization.privilege.service.ts.TraceOriginalStandardWriteService;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@Transactional(rollbackFor = Exception.class)
public class TraceOriginalStandardWriteServiceImpl implements TraceOriginalStandardWriteService {

    @Autowired
    private TraceOriginalStandardWriteMapper traceOriginalStandardWriteMapper;

    @Override
    public ResultVO<Void> deleteTraceOriginalStandard(TraceOriginalStandardVO traceOriginalStadardVO) throws Exception {

        TraceOriginalStandardVO newTraceOriginalStandardVO = new TraceOriginalStandardVO();
        newTraceOriginalStandardVO.setId(traceOriginalStadardVO.getId());
        newTraceOriginalStandardVO.setTosids(traceOriginalStadardVO.getTosids());
        newTraceOriginalStandardVO.setDeleteTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        this.traceOriginalStandardWriteMapper.updateTraceOriginalStandardVO(newTraceOriginalStandardVO);

        return ResultVO.getSuccess("删除原始轨迹标准轨迹映射成功");
    }
}
