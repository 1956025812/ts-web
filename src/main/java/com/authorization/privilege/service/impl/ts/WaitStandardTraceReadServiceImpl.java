package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegeread.ts.WaitStandardTraceReadMapper;
import com.authorization.privilege.service.ts.WaitStandardTraceReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.WaitStandardTraceVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitStandardTraceReadServiceImpl implements WaitStandardTraceReadService {

    @Autowired
    private WaitStandardTraceReadMapper waitStandardTraceReadMapper;

    @Override
    public ResultVO<PageVO<WaitStandardTraceVO>> selectWaitStandardTraceVOPage(WaitStandardTraceVO waitStandardTraceVO) throws Exception {

        PageHelper.startPage(waitStandardTraceVO.getCurrentPage(), waitStandardTraceVO.getPageSize());
        List<WaitStandardTraceVO> waitStandardTraceVOList =
                this.waitStandardTraceReadMapper.selectWaitStandardTraceVOList(waitStandardTraceVO);

        PageInfo<WaitStandardTraceVO> pageInfo = new PageInfo<>(waitStandardTraceVOList);
        PageVO<WaitStandardTraceVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询待标准化轨迹分页列表成功", pageVO);
    }
}
