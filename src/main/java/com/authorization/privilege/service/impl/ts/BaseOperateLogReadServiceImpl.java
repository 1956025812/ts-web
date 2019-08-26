package com.authorization.privilege.service.impl.ts;

import com.authorization.privilege.mapper.dsprivilegeread.ts.BaseOperateLogReadMapper;
import com.authorization.privilege.service.ts.BaseOperateLogReadService;
import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.BaseOperateLogVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseOperateLogReadServiceImpl implements BaseOperateLogReadService {

    @Autowired
    private BaseOperateLogReadMapper baseOperateLogReadMapper;


    @Override
    public ResultVO<PageVO<BaseOperateLogVO>> selectBaseOperateLogVOPage(BaseOperateLogVO baseOperateLogVO) throws Exception {

        PageHelper.startPage(baseOperateLogVO.getCurrentPage(), baseOperateLogVO.getPageSize());
        List<BaseOperateLogVO> baseOperateLogVOList = this.baseOperateLogReadMapper.selectBaseOperateLogVOList(baseOperateLogVO);

        PageInfo<BaseOperateLogVO> pageInfo = new PageInfo<>(baseOperateLogVOList);
        PageVO<BaseOperateLogVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询基础操作日志分页列表成功", pageVO);
    }
}
