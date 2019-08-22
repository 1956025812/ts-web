package com.authorization.privilege.mapper.dsprivilegewrite.ts;


import com.authorization.privilege.entity.dsprivelege.ts.StandardTrace;
import com.authorization.privilege.vo.ts.StandardTraceVO;

public interface StandardTraceWriteMapper {

    void insertSelective(StandardTrace standardTrace) throws Exception;

    void updateByPrimaryKeySelective(StandardTrace standardTrace) throws Exception;

    void updateByPrimaryKey(StandardTrace standardTrace) throws Exception;

    void updateStandardTraceVO(StandardTraceVO newStandardTraceVO) throws Exception;
}