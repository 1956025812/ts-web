package com.authorization.privilege.entity.dsprivelege.ts;

import com.authorization.privilege.vo.BaseVO;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BaseOperateLog extends BaseVO implements Serializable {

    private Long id;

    private Integer belongType;

    private Long thirdRecordId;

    private String remark;

    private String createBy;

    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getbelongType() {
        return belongType;
    }

    public void setbelongType(Integer belongType) {
        this.belongType = belongType;
    }

    public Long getThirdRecordId() {
        return thirdRecordId;
    }

    public void setThirdRecordId(Long thirdRecordId) {
        this.thirdRecordId = thirdRecordId;
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
}