package domain;

import util.TicketHelper; // Import the helper class

public class Ticket {
    private int ticketId;
    private int eventId;
    private String participantId;
    private double price;

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.eventId = builder.eventId;
        this.participantId = builder.participantId;
        this.price = builder.price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return TicketHelper.formatTicketDetails(ticketId, eventId, participantId, price);
    }

    public static class Builder {
        private int ticketId;
        private int eventId;
        private String participantId;
        private double price;

        public Builder setTicketId(int ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setEventId(int eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setParticipantId(String participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Ticket build() {
            // Validation using TicketHelper
            if (!TicketHelper.isValidPrice(price)) {
                throw new IllegalArgumentException("Price must be greater than 0.");
            }
            if (!TicketHelper.isValidParticipantId(participantId)) {
                throw new IllegalArgumentException("Participant ID cannot be empty.");
            }

            // Generate a unique ticket ID if not set
            if (ticketId == 0) {
                ticketId = TicketHelper.generateTicketId();
            }

            return new Ticket(this);
        }
    }
}
