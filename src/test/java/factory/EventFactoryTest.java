package factory;

/*
EventFactoryTest.java
Factory test for the Event
Author: Bekithemba Mrwetyana (222707077)
Date: 24 March 2025
*/

import domain.Event;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class EventFactoryTest {

    @Test
    void testCreateEvent() {
        Event event = EventFactory.createEvent("Tech Conference", LocalDate.of(2025, 5, 20), "Cape Town");

        assertNotNull(event);
        assertNotNull(event.getEventID());
        assertEquals("Tech Conference", event.getName());
    }

    @Test
    void testCreateEventWithInvalidData() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            EventFactory.createEvent("", LocalDate.of(2025, 5, 20), "Cape Town");
        });

        assertEquals("Invalid input: All fields must be provided", exception.getMessage());
    }
}

