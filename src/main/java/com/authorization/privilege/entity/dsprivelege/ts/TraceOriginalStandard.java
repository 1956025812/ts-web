package com.authorization.privilege.entity.dsprivelege.ts;

import com.authorization.privilege.vo.BaseVO;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TraceOriginalStandard extends BaseVO implements Serializable {

    private Long id;

    private String relationNo;

    private String originalTraceCode;

    private String standardTraceCode;

    private String logisticsAgentCode;

    private String logisticsMethodCode;

    private String conditionDesc;

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

    private Long deleteTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRelationNo() {
        return relationNo;
    }

    public void setRelationNo(String relationNo) {
        this.relationNo = relationNo == null ? null : relationNo.trim();
    }

    public String getOriginalTraceCode() {
        return originalTraceCode;
    }

    public void setOriginalTraceCode(String originalTraceCode) {
        this.originalTraceCode = originalTraceCode == null ? null : originalTraceCode.trim();
    }

    public String getStandardTraceCode() {
        return standardTraceCode;
    }

    public void setStandardTraceCode(String standardTraceCode) {
        this.standardTraceCode = standardTraceCode == null ? null : standardTraceCode.trim();
    }

    public String getLogisticsAgentCode() {
        return logisticsAgentCode;
    }

    public void setLogisticsAgentCode(String logisticsAgentCode) {
        this.logisticsAgentCode = logisticsAgentCode;
    }

    public String getLogisticsMethodCode() {
        return logisticsMethodCode;
    }

    public void setLogisticsMethodCode(String logisticsMethodCode) {
        this.logisticsMethodCode = logisticsMethodCode;
    }

    public String getConditionDesc() {
        return conditionDesc;
    }

    public void setConditionDesc(String conditionDesc) {
        this.conditionDesc = conditionDesc == null ? null : conditionDesc.trim();
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }
}