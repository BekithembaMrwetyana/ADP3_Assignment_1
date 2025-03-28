package repository;

import domain.Ticket;
import factory.TicketFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.ITicketRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TicketRepositoryTest {
    private ITicketRepository repository;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        repository = ITicketRepository.getRepository();
        ticket = TicketFactory.createTicket(20251, 101, "P005", "V001", 250.0);
        repository.create(ticket);
    }

    @Test
    void a_create() {
        Ticket created = repository.create(ticket);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Ticket read = repository.read(ticket.getTicketId());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Ticket newTicket = new Ticket.Builder()
                .copy(ticket)
                .setPrice(300.0)
                .build();
        Ticket updated = repository.update(newTicket);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(ticket.getTicketId()));
        System.out.println("Success: ticket deleted");
    }
}
