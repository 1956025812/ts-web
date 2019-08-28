package com.authorization.privilege.mapper.dsprivilegewrite.ts;


import com.authorization.privilege.entity.dsprivelege.ts.WaitStandardTrace;

public interface WaitStandardTraceWriteMapper {

    void insertSelective(WaitStandardTrace waitStandardTrace) throws Exception;

    void updateByPrimaryKeySelective(WaitStandardTrace waitStandardTrace) throws Exception;

    void updateByPrimaryKey(WaitStandardTrace waitStandardTrace) throws Exception;
}