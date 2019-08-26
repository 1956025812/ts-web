package com.authorization.privilege.service.ts;

import com.authorization.privilege.vo.PageVO;
import com.authorization.privilege.vo.ResultVO;
import com.authorization.privilege.vo.ts.BaseOperateLogVO;

public interface BaseOperateLogReadService {

    ResultVO<PageVO<BaseOperateLogVO>> selectBaseOperateLogVOPage(BaseOperateLogVO baseOperateLogVO) throws Exception;
}
