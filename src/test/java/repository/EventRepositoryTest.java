package repository;

/*
EventRepositoryTest.java
Repository test case for the Event
Author: Bekithemba Mrwetyana (222707077)
Date: 24 March 2025
*/

import domain.Event;
import repository.impl.EventRepository;
import factory.EventFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class EventRepositoryTest {

    private EventRepository repository;
    private Event event;

    @BeforeEach
    void setUp() {
        repository = EventRepository.getInstance();
        event = EventFactory.createEvent("Tech Conference", LocalDate.of(2025, 5, 20), "Cape Town");
        repository.create(event);
    }

    @Test
    void testCreate() {
        assertNotNull(repository.read(event.getEventID()));
    }

    @Test
    void testRead() {
        Event foundEvent = repository.read(event.getEventID());
        assertEquals(event, foundEvent);
    }

    @Test
    void testUpdate() {
        Event updatedEvent = new Event.Builder()
                .setEventID(event.getEventID())
                .setName("Updated Tech Conference")
                .setDate(event.getDate())
                .setLocation(event.getLocation())
                .build();

        repository.update(updatedEvent);

        assertEquals("Updated Tech Conference", repository.read(event.getEventID()).getName());
    }

    @Test
    void testDelete() {
        boolean isDeleted = repository.delete(event.getEventID());
        assertTrue(isDeleted);
        assertNull(repository.read(event.getEventID()));
    }
}

