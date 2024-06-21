package com.fundraising.service;

import com.fundraising.FundraisingEvent;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FundraisingServiceTest {
    private FundraisingService service;

    @Before
    public void setUp() {
        service = new FundraisingService();
    }

    @Test
    public void testCreateEvent() {
        service.createEvent("1", "Event 1", 1000);
        FundraisingEvent event = service.getEvent("1");
        assertNotNull(event);
        assertEquals("Event 1", event.getName());
        assertEquals(1000, event.getGoal(), 0);
    }

    @Test
    public void testUpdateEvent() {
        service.createEvent("1", "Event 1", 1000);
        service.updateEvent("1", "Updated Event 1", 2000);
        FundraisingEvent event = service.getEvent("1");
        assertEquals("Updated Event 1", event.getName());
        assertEquals(2000, event.getGoal(), 0);
    }

    @Test
    public void testDeleteEvent() {
        service.createEvent("1", "Event 1", 1000);
        service.deleteEvent("1");
        FundraisingEvent event = service.getEvent("1");
        assertNull(event);
    }
}