package com.authorization.privilege.mapper.dsprivilegewrite.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceOriginalStandard;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;

public interface TraceOriginalStandardWriteMapper {

    void insertSelective(TraceOriginalStandard traceOriginalStandard) throws Exception;

    void updateByPrimaryKeySelective(TraceOriginalStandard traceOriginalStandard) throws Exception;

    void updateByPrimaryKey(TraceOriginalStandard traceOriginalStandard) throws Exception;

    void updateTraceOriginalStandardVO(TraceOriginalStandardVO newTraceOriginalStandardVO) throws Exception;
}