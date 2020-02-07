package com.hancher.demo.sharding.jdbc.repository.entity;

import java.util.Date;

public class OrderEntity {
    private Long id;

    private String orderCode;

    private String oneCode;

    private String twoCode;

    private String bizCode;

    private Integer handlerCode;

    private Date timeoutTime;

    private String status;

    private Integer isTimeout;

    private String orderDesc;

    private Long startStamp;

    private Byte isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOneCode() {
        return oneCode;
    }

    public void setOneCode(String oneCode) {
        this.oneCode = oneCode == null ? null : oneCode.trim();
    }

    public String getTwoCode() {
        return twoCode;
    }

    public void setTwoCode(String twoCode) {
        this.twoCode = twoCode == null ? null : twoCode.trim();
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public Integer getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerCode(Integer handlerCode) {
        this.handlerCode = handlerCode;
    }

    public Date getTimeoutTime() {
        return timeoutTime;
    }

    public void setTimeoutTime(Date timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIsTimeout() {
        return isTimeout;
    }

    public void setIsTimeout(Integer isTimeout) {
        this.isTimeout = isTimeout;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Long getStartStamp() {
        return startStamp;
    }

    public void setStartStamp(Long startStamp) {
        this.startStamp = startStamp;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", orderCode='" + orderCode + '\'' +
                ", oneCode='" + oneCode + '\'' +
                ", twoCode='" + twoCode + '\'' +
                ", bizCode='" + bizCode + '\'' +
                ", handlerCode=" + handlerCode +
                ", timeoutTime=" + timeoutTime +
                ", status='" + status + '\'' +
                ", isTimeout=" + isTimeout +
                ", orderDesc='" + orderDesc + '\'' +
                ", startStamp=" + startStamp +
                ", isDel=" + isDel +
                '}';
    }
}