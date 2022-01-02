package com.example.demo;

//import jdk.jfr.Timespan;

import java.util.Date;

public class SchedulingRecurrenceEventModel {

    private Long count;
    private String[] days;
    private String frequency;
    private Long interval;
    private Boolean isRecurrenceModel;
    private Long[] monthDays;
    private Long positions;
    private String rule;
    private Date endDate;
//    private Timespan timeSpan;
    private Date timeSpan;

    public SchedulingRecurrenceEventModel(Long count, String[] days, String frequency, Long interval, Boolean isRecurrenceModel, Long[] monthDays, Long positions, String rule, Date endDate, Date timeSpan) {
        this.count = count;
        this.days = days;
        this.frequency = frequency;
        this.interval = interval;
        this.isRecurrenceModel = isRecurrenceModel;
        this.monthDays = monthDays;
        this.positions = positions;
        this.rule = rule;
        this.endDate = endDate;
        this.timeSpan = timeSpan;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Boolean getRecurrenceModel() {
        return isRecurrenceModel;
    }

    public void setRecurrenceModel(Boolean recurrenceModel) {
        isRecurrenceModel = recurrenceModel;
    }

    public Long[] getMonthDays() {
        return monthDays;
    }

    public void setMonthDays(Long[] monthDays) {
        this.monthDays = monthDays;
    }

    public Long getPositions() {
        return positions;
    }

    public void setPositions(Long positions) {
        this.positions = positions;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Date timeSpan) {
        this.timeSpan = timeSpan;
    }
}
