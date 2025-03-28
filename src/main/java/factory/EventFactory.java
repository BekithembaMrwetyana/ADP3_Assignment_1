package factory;
/*
EventFactory.java
Event factory class
Author: Bekithemba Mrwetyana (222706066)
Date: 20 March 2025
*/
import domain.Event;

import java.time.LocalDate;

public class EventFactory {

    public static Event createEvent(String eventID, String name, LocalDate date, String location){

        if (name == null || name.isEmpty() || location == null || location.isEmpty() || date == null) {
            throw new IllegalArgumentException("Event details cannot be empty!");
        }

        return new Event.Builder()
                .setEventID(eventID)
                .setName(name)
                .setDate(date)
                .setLocation(location)
                .build();

    }

}
