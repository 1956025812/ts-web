package com.authorization.privilege.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;

/**
 * @author duxuebo
 * @date 2018/12/5
 * @description 基础VO对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseVO {

    @ApiModelProperty("当前登录用户ID")
    private String loginUid;

    @ApiModelProperty("统一日志ID")
    private String logId;

    @ApiModelProperty("当前页码")
    private Integer currentPage;

    @ApiModelProperty("每页条数")
    private Integer pageSize;

    @ApiModelProperty("创建人名称")
    private String createName;

    @ApiModelProperty("修改人名称")
    private String updateName;

    @ApiModelProperty("开始时间 格式：yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间 格式：yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    @ApiModelProperty("开始日期 格式：yyyy-MM-dd")
    private LocalDate startDate;

    @ApiModelProperty("结束日期 格式：yyyy-MM-dd")
    private LocalDate endDate;

    @ApiModelProperty("开始月份 格式：yyyy-MM")
    private YearMonth startMonth;

    @ApiModelProperty("结束月份 格式：yyyy-MM")
    private YearMonth endMonth;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getLoginUid() {
        return loginUid;
    }

    public void setLoginUid(String loginUid) {
        this.loginUid = loginUid;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getStartTime() {
        return startTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public LocalDateTime getEndTime() {
        return endTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public LocalDate getStartDate() {
        return startDate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public LocalDate getEndDate() {
        return endDate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
    public YearMonth getStartMonth() {
        return startMonth;
    }

    @DateTimeFormat(pattern = "yyyy-MM")
    public void setStartMonth(YearMonth startMonth) {
        this.startMonth = startMonth;
    }

    @JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
    public YearMonth getEndMonth() {
        return endMonth;
    }

    @DateTimeFormat(pattern = "yyyy-MM")
    public void setEndMonth(YearMonth endMonth) {
        this.endMonth = endMonth;
    }
}
