package com.authorization.privilege.vo.ts;

import com.authorization.privilege.entity.dsprivelege.ts.WaitStandardTrace;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WaitStandardTraceVO extends WaitStandardTrace {

    private List<Long> wstids;

    public List<Long> getWstids() {
        return wstids;
    }

    public void setWstids(List<Long> wstids) {
        this.wstids = wstids;
    }
}
