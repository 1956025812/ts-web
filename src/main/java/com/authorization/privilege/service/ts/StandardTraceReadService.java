package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.StandardTraceVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;

public interface StandardTraceReadService {

    ResultVO<PageVO<TraceCycleVO>> selectStandardTraceVOPage(StandardTraceVO standardTraceVO) throws Exception;

    ResultVO<TraceCycleVO> selectStandardTraceDetail(StandardTraceVO standardTraceVO) throws Exception;
}
