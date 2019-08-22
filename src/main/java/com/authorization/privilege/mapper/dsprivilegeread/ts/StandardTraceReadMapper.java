package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.StandardTrace;
import com.authorization.privilege.vo.ts.StandardTraceVO;

import java.util.List;

public interface StandardTraceReadMapper {

    StandardTrace selectByPrimaryKey(Long id) throws Exception;

    List<StandardTraceVO> selectStandardTraceVOList(StandardTraceVO standardTraceVO) throws Exception;
}