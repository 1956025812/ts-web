package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceCycle;
import com.authorization.privilege.mapper.dsprivilegeread.ts.TraceCycleReadMapper;
import com.authorization.privilege.service.ts.TraceCycleReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceCycleReadServiceImpl implements TraceCycleReadService {

    @Autowired
    private TraceCycleReadMapper traceCycleReadMapper;

    @Override
    public ResultVO<PageVO<TraceCycleVO>> selectTraceCycleVOPage(TraceCycleVO traceCycleVO) throws Exception {

        PageHelper.startPage(traceCycleVO.getCurrentPage(), traceCycleVO.getPageSize());
        List<TraceCycleVO> traceCycleVOList = this.traceCycleReadMapper.selectTraceCycleVOList(traceCycleVO);

        PageInfo<TraceCycleVO> pageInfo = new PageInfo<>(traceCycleVOList);
        PageVO<TraceCycleVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询轨迹环节分页列表成功", pageVO);
    }



    @Override
    public ResultVO<TraceCycleVO> selectTraceCycleVODetail(TraceCycleVO traceCycleVO) throws Exception {

        TraceCycle traceCycle = this.traceCycleReadMapper.selectByPrimaryKey(traceCycleVO.getId());

        return ResultVO.getSuccess("查询轨迹环节成功", traceCycle);
    }
}
