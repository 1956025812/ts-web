package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;

public interface TraceOriginalStandardWriteService {

    ResultVO<Void> deleteTraceOriginalStandard(TraceOriginalStandardVO traceOriginalStandardVO) throws Exception;
}
