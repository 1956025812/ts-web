package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;

public interface WaitStandardTraceWriteService {

    ResultVO<Void> deleteWaitStandardTrace(WaitStandardTraceVO waitStandardTraceVO) throws Exception;
}
