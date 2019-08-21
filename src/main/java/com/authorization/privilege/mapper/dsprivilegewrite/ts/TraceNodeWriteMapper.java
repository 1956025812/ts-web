package com.authorization.privilege.mapper.dsprivilegewrite.ts;


import com.authorization.privilege.entity.dsprivelege.ts.TraceNode;
import com.authorization.privilege.vo.ts.TraceNodeVO;

public interface TraceNodeWriteMapper {

    void insertSelective(TraceNode traceNode) throws Exception;

    void updateByPrimaryKey(TraceNode traceNode) throws Exception;

    void updateByPrimaryKeySelective(TraceNode traceNode) throws Exception;

    void updateTraceNodeVO(TraceNodeVO newTraceNodeVO) throws Exception;
}