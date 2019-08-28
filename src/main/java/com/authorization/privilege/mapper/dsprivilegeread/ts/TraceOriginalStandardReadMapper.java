package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.TraceOriginalStandard;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;

import java.util.List;

public interface TraceOriginalStandardReadMapper {

    TraceOriginalStandard selectByPrimaryKey(Long id) throws Exception;

    List<TraceOriginalStandardVO> selectTraceOriginalStandardVOList(
            TraceOriginalStandardVO traceOriginalStandardVO) throws Exception;
}