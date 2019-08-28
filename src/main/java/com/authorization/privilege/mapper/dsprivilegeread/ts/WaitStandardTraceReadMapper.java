package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.WaitStandardTrace;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;

import java.util.List;

public interface WaitStandardTraceReadMapper {


    WaitStandardTrace selectByPrimaryKey(Long id) throws Exception;

    List<WaitStandardTraceVO> selectWaitStandardTraceVOList(WaitStandardTraceVO waitStandardTraceVO) throws Exception;
}