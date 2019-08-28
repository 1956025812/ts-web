package com.authorization.privilege.vo.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceOriginalStandard;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TraceOriginalStandardVO extends TraceOriginalStandard {

    private List<Long> tosids;

    public List<Long> getTosids() {
        return tosids;
    }

    public void setTosids(List<Long> tosids) {
        this.tosids = tosids;
    }
}
