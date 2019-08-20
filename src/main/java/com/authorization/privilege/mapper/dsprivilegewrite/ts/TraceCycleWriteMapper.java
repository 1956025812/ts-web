package com.authorization.privilege.mapper.dsprivilegewrite.ts;


import com.authorization.privilege.entity.dsprivelege.ts.TraceCycle;
import com.authorization.privilege.vo.ts.TraceCycleVO;

public interface TraceCycleWriteMapper {

    void insertSelective(TraceCycle traceCycle) throws Exception;

    void updateByPrimaryKeySelective(TraceCycle traceCycle) throws Exception;

    void updateByPrimaryKey(TraceCycle traceCycle) throws Exception;

    void updateTraceCycleVO(TraceCycleVO newTraceCycleVO) throws Exception;
}