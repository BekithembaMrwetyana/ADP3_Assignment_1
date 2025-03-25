package domain;

public class Venue {
    private final String venueID; // Primary Key
    private final String name;
    private final String address;

    // Private constructor to enforce the use of the Builder
    private Venue(Builder builder) {
        this.venueID = builder.venueID;
        this.name = builder.name;
        this.address = builder.address;
    }

    // Getters
    public String getVenueID() {
        return venueID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Builder Pattern
    public static class Builder {
        private String venueID;
        private String name;
        private String address;

        public Builder setVenueID(String venueID) {
            this.venueID = venueID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Venue build() {
            return new Venue(this);
        }
    }
}
