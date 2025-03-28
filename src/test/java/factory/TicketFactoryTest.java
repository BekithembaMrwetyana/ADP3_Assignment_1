package factory;

import domain.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketFactoryTest {

    @Test
    public void testCreateTicket() {
        Ticket ticket = TicketFactory.createTicket(20251,101, "P005", "V001", 250.0);

        assertNotNull(ticket);
        assertEquals(20251, ticket.getTicketId());
        assertEquals(101, ticket.getEventId());
        assertEquals("P005", ticket.getParticipantId());
        assertEquals("V001", ticket.getVenueId());
        assertEquals(250.0, ticket.getPrice());
    }

    @Test
    public void testCreateTicketWithInvalidPrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TicketFactory.createTicket(20251,101, "P005", "V001", 0.0);
        });

        assertEquals("Price must be greater than 0.", exception.getMessage());
    }

    @Test
    public void testCreateTicketWithEmptyParticipantId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TicketFactory.createTicket(20251,101, "", "V001", 250.0);
        });

        assertEquals("Participant ID cannot be empty.", exception.getMessage());
    }
}
