package com.authorization.privilege.mapper.dsprivilegeread.ts;


import com.authorization.privilege.entity.dsprivelege.ts.TraceCycle;
import com.authorization.privilege.vo.ts.TraceCycleVO;

import java.util.List;

public interface TraceCycleReadMapper {

    TraceCycle selectByPrimaryKey(Long tcid) throws Exception;

    List<TraceCycleVO> selectTraceCycleVOList(TraceCycleVO traceCycleVO) throws Exception;
}