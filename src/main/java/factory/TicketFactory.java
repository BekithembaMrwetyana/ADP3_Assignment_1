package factory;

import domain.Ticket;

public class TicketFactory {
    public static Ticket createTicket(int ticketId, int eventId, int participantId, double price) {
        return new Ticket.Builder()
                .setTicketId(ticketId)
                .setEventId(eventId)
                .setParticipantId(participantId)
                .setPrice(price)
                .build();
    }
}