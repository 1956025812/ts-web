package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegeread.ts.TraceOriginalStandardReadMapper;
import com.authorization.privilege.service.ts.TraceOriginalStandardReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.TraceOriginalStandardVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceOriginalStandardReadServiceImpl implements TraceOriginalStandardReadService {

    @Autowired
    private TraceOriginalStandardReadMapper traceOriginalStandardReadMapper;

    @Override
    public ResultVO<PageVO<TraceOriginalStandardVO>> selectTraceOriginalStandardVOPage(TraceOriginalStandardVO traceOriginalStandardVO) throws Exception {

        PageHelper.startPage(traceOriginalStandardVO.getCurrentPage(), traceOriginalStandardVO.getPageSize());
        List<TraceOriginalStandardVO> traceOriginalStandardVOList =
                this.traceOriginalStandardReadMapper.selectTraceOriginalStandardVOList(traceOriginalStandardVO);

        PageInfo<TraceOriginalStandardVO> pageInfo = new PageInfo<>(traceOriginalStandardVOList);
        PageVO<TraceOriginalStandardVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询原始轨迹标准轨迹映射分页列表成功", pageVO);
    }
}
