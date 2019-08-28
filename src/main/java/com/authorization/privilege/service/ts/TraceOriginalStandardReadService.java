package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;

public interface TraceOriginalStandardReadService {


    ResultVO<PageVO<TraceOriginalStandardVO>> selectTraceOriginalStandardVOPage(
            TraceOriginalStandardVO traceOriginalStandardVO) throws Exception;
}
