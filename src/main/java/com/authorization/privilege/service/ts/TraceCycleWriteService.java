package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;

public interface TraceCycleWriteService {


    ResultVO<Void> saveTraceCycle(TraceCycleVO traceCycleVO) throws Exception;

    ResultVO<Void> updateTraceCycle(TraceCycleVO traceCycleVO) throws Exception;

    ResultVO<Void> deleteTraceCycle(TraceCycleVO traceCycleVO) throws Exception;
}
