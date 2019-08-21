package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.TraceNode;
import com.authorization.privilege.vo.ts.TraceNodeVO;

import java.util.List;

public interface TraceNodeReadMapper {


    TraceNode selectByPrimaryKey(Long id) throws Exception;

    List<TraceNodeVO> selectTraceNodeVOList(TraceNodeVO traceNodeVO) throws Exception;
}