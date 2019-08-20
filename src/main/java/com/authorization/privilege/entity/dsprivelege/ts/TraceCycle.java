package com.authorization.privilege.entity.dsprivelege.ts;

import com.authorization.privilege.vo.BaseVO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TraceCycle extends BaseVO implements Serializable {

    private Long id;

    private String cycleCode;

    private String cycleNameCn;

    private String cycleNameEn;

    private String remark;

    private String createBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    private String updateBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    private Long deleteTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCycleCode() {
        return cycleCode;
    }

    public void setCycleCode(String cycleCode) {
        this.cycleCode = cycleCode == null ? null : cycleCode.trim();
    }

    public String getCycleNameCn() {
        return cycleNameCn;
    }

    public void setCycleNameCn(String cycleNameCn) {
        this.cycleNameCn = cycleNameCn == null ? null : cycleNameCn.trim();
    }

    public String getCycleNameEn() {
        return cycleNameEn;
    }

    public void setCycleNameEn(String cycleNameEn) {
        this.cycleNameEn = cycleNameEn == null ? null : cycleNameEn.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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