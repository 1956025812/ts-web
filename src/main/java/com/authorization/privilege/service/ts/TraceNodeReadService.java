package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceNodeVO;

public interface TraceNodeReadService {

    ResultVO<PageVO<TraceNodeVO>> selectTraceNodePage(TraceNodeVO traceNodeVO) throws Exception;

    ResultVO<TraceNodeVO> selectTraceNodeVODetail(TraceNodeVO traceNodeVO) throws Exception;
}
