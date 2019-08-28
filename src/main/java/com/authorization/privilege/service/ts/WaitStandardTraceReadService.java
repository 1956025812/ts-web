package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;

public interface WaitStandardTraceReadService {


    ResultVO<PageVO<WaitStandardTraceVO>> selectWaitStandardTraceVOPage(WaitStandardTraceVO waitStandardTraceVO) throws Exception;
}
