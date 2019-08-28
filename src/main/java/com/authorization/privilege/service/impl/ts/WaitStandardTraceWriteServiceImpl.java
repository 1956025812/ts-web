package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegewrite.ts.WaitStandardTraceWriteMapper;
import com.authorization.privilege.service.ts.WaitStandardTraceWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class WaitStandardTraceWriteServiceImpl implements WaitStandardTraceWriteService {

    @Autowired
    private WaitStandardTraceWriteMapper waitStandardTraceWriteMapper;


}
