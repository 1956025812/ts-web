package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegewrite.ts.BaseOperateLogWriteMapper;
import com.authorization.privilege.service.ts.BaseOperateLogWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class BaseOperateLogWriteServiceImpl implements BaseOperateLogWriteService {

    @Autowired
    private BaseOperateLogWriteMapper baseOperateLogWriteMapper;

}
