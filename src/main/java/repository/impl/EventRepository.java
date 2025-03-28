package repository.impl;

/*
EventRepository.java
Event repository implementation class
Author: Bekithemba Mrwetyana (222707077)
Date: 24 March 2025
*/

import domain.Event;
import repository.IEventRepository;
import java.util.*;

public class EventRepository implements IEventRepository<Event, String> {

    private static volatile EventRepository repository = null;
    private Map<String, Event> eventMap;

    private EventRepository() {
        this.eventMap = new HashMap<>();
    }

    public static EventRepository getInstance() {
        if (repository == null) {
            synchronized (EventRepository.class) {
                if (repository == null) {
                    repository = new EventRepository();
                }
            }
        }
        return repository;
    }

    @Override
    public Event create(Event event) {
        if (event != null && !eventMap.containsKey(event.getEventID())) {
            eventMap.put(event.getEventID(), event);
            return event;
        }
        return null;
    }

    @Override
    public Event read(String eventID) {
        return eventMap.get(eventID);
    }

    @Override
    public Event update(Event event) {
        if (event != null && eventMap.containsKey(event.getEventID())) {
            eventMap.put(event.getEventID(), event);
            return event;
        }
        return null;
    }

    @Override
    public boolean delete(String eventID) {
        if (eventMap.containsKey(eventID)) {
            eventMap.remove(eventID);
            return true;
        }
        return false;
    }

    @Override
    public Set<Event> getAll() {
        return new HashSet<>(eventMap.values());
    }
}

