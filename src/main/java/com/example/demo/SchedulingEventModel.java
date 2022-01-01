package com.example.demo;

import java.util.Date;

public class SchedulingEventModel {

    private Long webId;
    private String title;
    private String branchId;
    private String eventType;
    private Date startDate;
    private Boolean isAllDay;
    private Boolean isRecurring;
    private String duration;
    private String recurringPattern;
    private String exceptionDates;
    private Date endDate;
    private Long webUserId;
    private String customerId;
    private String customerNumber;
    private String customerName;
    private String workOrderId;
    private String workOrderName;
    private String workOrderPriority;

    public SchedulingEventModel(Long webId, String title, String branchId, String eventType, Date startDate, Boolean isAllDay, Boolean isRecurring, String duration, String recurringPattern, String exceptionDates, Date endDate, Long webUserId, String customerId, String customerNumber, String customerName, String workOrderId, String workOrderName, String workOrderPriority) {
        this.webId = webId;
        this.title = title;
        this.branchId = branchId;
        this.eventType = eventType;
        this.startDate = startDate;
        this.isAllDay = isAllDay;
        this.isRecurring = isRecurring;
        this.duration = duration;
        this.recurringPattern = recurringPattern;
        this.exceptionDates = exceptionDates;
        this.endDate = endDate;
        this.webUserId = webUserId;
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.workOrderId = workOrderId;
        this.workOrderName = workOrderName;
        this.workOrderPriority = workOrderPriority;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Boolean getIsAllDay() {
        return isAllDay;
    }

    public void setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
    }

    public Boolean getIsRecurring() {
        return isRecurring;
    }

    public void setIsRecurring(Boolean isRecurring) {
        this.isRecurring = isRecurring;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRecurringPattern() {
        return recurringPattern;
    }

    public void setRecurringPattern(String recurringPattern) {
        this.recurringPattern = recurringPattern;
    }

    public String getExceptionDates() {
        return exceptionDates;
    }

    public void setExceptionDates(String exceptionDates) {
        this.exceptionDates = exceptionDates;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getWebUserId() {
        return webUserId;
    }

    public void setWebUserId(Long webUserId) {
        this.webUserId = webUserId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderName() {
        return workOrderName;
    }

    public void setWorkOrderName(String workOrderName) {
        this.workOrderName = workOrderName;
    }

    public String getWorkOrderPriority() {
        return workOrderPriority;
    }

    public void setWorkOrderPriority(String workOrderPriority) {
        this.workOrderPriority = workOrderPriority;
    }
}
