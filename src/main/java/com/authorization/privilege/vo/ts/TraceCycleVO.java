package com.authorization.privilege.vo.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceCycle;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TraceCycleVO extends TraceCycle {

    private List<Long> tcids;

    public List<Long> getTcids() {
        return tcids;
    }

    public void setTcids(List<Long> tcids) {
        this.tcids = tcids;
    }
}
