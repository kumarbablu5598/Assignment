package com.university.model;

public class Events {
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String  startTime;
    private String  endTime;

    public Events() {
    }

    public Events(int eventId, String eventName, String locationOfEvent, String date, String startTime, String endTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.locationOfEvent = locationOfEvent;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
