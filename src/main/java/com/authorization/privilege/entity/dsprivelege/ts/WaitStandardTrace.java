package com.authorization.privilege.entity.dsprivelege.ts;

import com.authorization.privilege.vo.BaseVO;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class WaitStandardTrace extends BaseVO implements Serializable {

    private Long id;

    private String logisticsMainNo;

    private String customerReferenceNo;

    private String agentNo;

    private String logisticsProductCode;

    private String logisticsChannelCode;

    private String originalTraceCode;

    private String originalTraceRemark;

    private LocalDateTime traceCreateTime;

    private Integer traceSource;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private Long deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogisticsMainNo() {
        return logisticsMainNo;
    }

    public void setLogisticsMainNo(String logisticsMainNo) {
        this.logisticsMainNo = logisticsMainNo == null ? null : logisticsMainNo.trim();
    }

    public String getCustomerReferenceNo() {
        return customerReferenceNo;
    }

    public void setCustomerReferenceNo(String customerReferenceNo) {
        this.customerReferenceNo = customerReferenceNo == null ? null : customerReferenceNo.trim();
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo == null ? null : agentNo.trim();
    }

    public String getLogisticsProductCode() {
        return logisticsProductCode;
    }

    public void setLogisticsProductCode(String logisticsProductCode) {
        this.logisticsProductCode = logisticsProductCode == null ? null : logisticsProductCode.trim();
    }

    public String getLogisticsChannelCode() {
        return logisticsChannelCode;
    }

    public void setLogisticsChannelCode(String logisticsChannelCode) {
        this.logisticsChannelCode = logisticsChannelCode == null ? null : logisticsChannelCode.trim();
    }

    public String getOriginalTraceCode() {
        return originalTraceCode;
    }

    public void setOriginalTraceCode(String originalTraceCode) {
        this.originalTraceCode = originalTraceCode == null ? null : originalTraceCode.trim();
    }

    public String getOriginalTraceRemark() {
        return originalTraceRemark;
    }

    public void setOriginalTraceRemark(String originalTraceRemark) {
        this.originalTraceRemark = originalTraceRemark == null ? null : originalTraceRemark.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getTraceCreateTime() {
        return traceCreateTime;
    }

    public void setTraceCreateTime(LocalDateTime traceCreateTime) {
        this.traceCreateTime = traceCreateTime;
    }

    public Integer getTraceSource() {
        return traceSource;
    }

    public void setTraceSource(Integer traceSource) {
        this.traceSource = traceSource;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
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