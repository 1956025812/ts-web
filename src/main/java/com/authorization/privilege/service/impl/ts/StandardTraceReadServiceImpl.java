package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.entity.dsprivelege.ts.StandardTrace;
import com.authorization.privilege.mapper.dsprivilegeread.ts.StandardTraceReadMapper;
import com.authorization.privilege.service.ts.StandardTraceReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.StandardTraceVO;
import com.authorization.privilege.vo.ts.TraceCycleVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardTraceReadServiceImpl implements StandardTraceReadService {

    @Autowired
    private StandardTraceReadMapper standardTraceReadMapper;


    @Override
    public ResultVO<PageVO<TraceCycleVO>> selectStandardTraceVOPage(StandardTraceVO standardTraceVO) throws Exception {

        PageHelper.startPage(standardTraceVO.getCurrentPage(), standardTraceVO.getPageSize());
        List<StandardTraceVO> standardTraceVOList = this.standardTraceReadMapper.selectStandardTraceVOList(standardTraceVO);

        PageInfo<StandardTraceVO> pageInfo = new PageInfo<>(standardTraceVOList);
        PageVO<StandardTraceVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询标准轨迹分页列表成功", pageVO);
    }


    @Override
    public ResultVO<TraceCycleVO> selectStandardTraceDetail(StandardTraceVO standardTraceVO) throws Exception {

        StandardTrace standardTrace = this.standardTraceReadMapper.selectByPrimaryKey(standardTraceVO.getId());

        return ResultVO.getSuccess("查询标准轨迹详情成功", standardTrace);
    }
}
