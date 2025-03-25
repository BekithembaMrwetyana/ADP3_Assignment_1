package za.ac.cput.domain;

import java.time.LocalDate;

public class Event {
    private String eventID;
    private String name;
    private LocalDate date;
    private String location;

    public Event() {
    }

    public Event(Builder builder) {
        this.eventID = builder.eventID;
        this.date = builder.date;
        this.name = builder.name;
        this.location = builder.location;
    }

    public String getEventID() {

        return eventID;
    }

    public Event setEventID(String eventID) {
        this.eventID = eventID;
        return this;
    }

    public String getName() {
        return name;
    }

    public Event setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Event setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Event setLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                '}';
    }

    public static class Builder {

        private String eventID;
        private String name;
        private LocalDate date;
        private String location;

        public String getEventID() {
            return eventID;
        }

        public Builder setEventID(String eventID) {
            this.eventID = eventID;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public LocalDate getDate() {
            return date;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public String getLocation() {
            return location;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder copy(Event event) {
            return this;
        }

        public Event build() {
            return new Event(this);
        }

    }


}