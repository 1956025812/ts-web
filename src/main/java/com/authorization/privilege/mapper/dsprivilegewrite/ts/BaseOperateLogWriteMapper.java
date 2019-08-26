package com.authorization.privilege.mapper.dsprivilegewrite.ts;


import com.authorization.privilege.entity.dsprivelege.ts.BaseOperateLog;

public interface BaseOperateLogWriteMapper {

    void insertSelective(BaseOperateLog baseOperateLog) throws Exception;

    void updateByPrimaryKeySelective(BaseOperateLog baseOperateLog) throws Exception;

    void updateByPrimaryKey(BaseOperateLog baseOperateLog) throws Exception;
}