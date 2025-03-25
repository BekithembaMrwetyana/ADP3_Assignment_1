package domain;

public class Venue {
    private final String venueID; 
    private final String name;
    private final String address;

    
    private Venue(Builder builder) {
        this.venueID = builder.venueID;
        this.name = builder.name;
        this.address = builder.address;
    }

    
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
