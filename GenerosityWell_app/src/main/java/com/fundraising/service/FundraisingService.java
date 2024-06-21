package com.fundraising.service;

import com.fundraising.FundraisingEvent;
import java.util.HashMap;
import java.util.Map;

public class FundraisingService {
    private final Map<String, FundraisingEvent> events;

    public FundraisingService() {
        events = new HashMap<>();
    }

    public void createEvent(String id, String name, double goal) {
        if (!events.containsKey(id)) {
            events.put(id, new FundraisingEvent(id, name, goal));
        } else {
            System.out.println("Event with this ID already exists.");
        }
    }

    public FundraisingEvent getEvent(String id) {
        return events.get(id);
    }

    public void updateEvent(String id, String name, double goal) {
        if (events.containsKey(id)) {
            FundraisingEvent event = events.get(id);
            event.setName(name);
            event.setGoal(goal);
        } else {
            System.out.println("Event with this ID does not exist.");
        }
    }

    public void deleteEvent(String id) {
        if (events.containsKey(id)) {
            events.remove(id);
        } else {
            System.out.println("Event with this ID does not exist.");
        }
    }
}