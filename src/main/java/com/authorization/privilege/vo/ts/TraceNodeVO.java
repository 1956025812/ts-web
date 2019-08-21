package com.authorization.privilege.vo.ts;

import com.authorization.privilege.entity.dsprivelege.ts.TraceNode;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TraceNodeVO extends TraceNode {

    private List<Long> tnids;

    public List<Long> getTnids() {
        return tnids;
    }

    public void setTnids(List<Long> tnids) {
        this.tnids = tnids;
    }
}
