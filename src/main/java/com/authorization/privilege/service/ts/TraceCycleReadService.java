package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;

public interface TraceCycleReadService {

    /**
     * 查询轨迹环节分页列表
     *
     * @param traceCycleVO
     * @return
     * @throws Exception
     */
    ResultVO<PageVO<TraceCycleVO>> selectTraceCycleVOPage(TraceCycleVO traceCycleVO) throws Exception;


    ResultVO<TraceCycleVO> selectTraceCycleVODetail(TraceCycleVO traceCycleVO) throws Exception;
}
