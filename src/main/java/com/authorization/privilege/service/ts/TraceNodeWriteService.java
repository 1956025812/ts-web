package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceNodeVO;

public interface TraceNodeWriteService {

    ResultVO<Void> saveTraceNode(TraceNodeVO traceNodeVO) throws Exception;

    ResultVO<Void> updateTraceNode(TraceNodeVO traceNodeVO) throws Exception;

    ResultVO<Void> deleteTraceNode(TraceNodeVO traceNodeVO) throws Exception;
}
