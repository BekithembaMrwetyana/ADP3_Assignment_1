package factory;

import domain.Ticket;

public class TicketFactory {
    public static Ticket createTicket(int ticketId, int eventId, String participantId, String venueId, double price) {
        if (eventId <= 0 || participantId == null || participantId.isEmpty() || price <= 0 || venueId == null || venueId.isEmpty()) {
            throw new IllegalArgumentException("Invalid ticket details: Event ID, Participant ID, Venue ID, and Price must be valid.");
        }
        return new Ticket.Builder()
                .setTicketId(ticketId)
                .setEventId(eventId)
                .setParticipantId(participantId)
                .setPrice(price)
                .setVenueId(venueId)
                .build();
    }
}
