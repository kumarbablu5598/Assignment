package com.university.service;

import com.university.model.Events;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private static List<Events> events = new ArrayList<>();

    static {
        events.add(new Events(10, "Sarswati Puja", "kolkata", "10-feb", "10Am", "4Pm"));
        events.add(new Events(11, "Fresher party", "kolkata", "15-feb", "9Am", "1Pm"));
        events.add(new Events(12, "farewell party", "kolkata", "10-jan", "11Am", "3Pm"));
        events.add(new Events(14, "Durga Puja", "kolkata", "11-mar", "8Am", "8Pm"));

    }

    public List<Events> getallevents() {
        return events;
    }

    public Events getEventbyId(int id) {
        Events ev = events.get(id);
        return ev;

    }

    public void addevent(Events eventDetails) {
        events.add(eventDetails);
    }

    public void deletebyid(int id) {
        events.remove(id);
    }

    public void updateEvent(Events eventdetails, int id) {
        Events updatevent = getEventbyId(id);
        updatevent.setEventName(eventdetails.getEventName());
        updatevent.setLocationOfEvent(eventdetails.getLocationOfEvent());
        updatevent.setDate(eventdetails.getDate());
        updatevent.setStartTime(eventdetails.getStartTime());
        updatevent.setEndTime(eventdetails.getEndTime());
    }
}


