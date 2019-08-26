package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.BaseOperateLog;
import com.authorization.privilege.vo.ts.BaseOperateLogVO;

import java.util.List;

public interface BaseOperateLogReadMapper {

    BaseOperateLog selectByPrimaryKey(Long id) throws Exception;

    List<BaseOperateLogVO> selectBaseOperateLogVOList(BaseOperateLogVO baseOperateLogVO) throws Exception;
}