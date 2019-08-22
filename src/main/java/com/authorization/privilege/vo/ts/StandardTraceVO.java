package com.authorization.privilege.vo.ts;

import com.authorization.privilege.entity.dsprivelege.ts.StandardTrace;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StandardTraceVO extends StandardTrace {

    private List<Long> stids;

    public List<Long> getStids() {
        return stids;
    }

    public void setStids(List<Long> stids) {
        this.stids = stids;
    }
}
