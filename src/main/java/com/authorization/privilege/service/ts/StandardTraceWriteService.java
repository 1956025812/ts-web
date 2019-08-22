package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.StandardTraceVO;

public interface StandardTraceWriteService {

    ResultVO<Void> saveStandardTrace(StandardTraceVO standardTraceVO) throws Exception;

    ResultVO<Void> updateStandardTrace(StandardTraceVO standardTraceVO) throws Exception;

    ResultVO<Void> deleteStandardTrace(StandardTraceVO standardTraceVO) throws Exception;
}
