/* Organizer RepositoryT class
Author: Abethu Ngxitho (221297820)
Date: 27/03/2025
 */
package repository;

import domain.Organizer;
import factory.OrganizerFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import repository.impl.OrganizerRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OrganizerRepositoryTest {

    private static OrganizerRepository repository = new OrganizerRepository();

    private Organizer organizer = OrganizerFactory.createOrganizer("ORG123", "Moses Banks", "mosesbank@gmail.com");

     @Test
    public void a_create() {
        Organizer created = repository.create(organizer);
        assertNotNull(created);
        System.out.println(created.toString());

    }

    @Test
    public void b_read(){
        Organizer read = repository.read(organizer.getOrganizerID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    public void c_update() {
        Organizer newOrganizer = new Organizer.Builder().copy(organizer).setName("Moses Banks")
                .build();
        Organizer updated = repository.update(newOrganizer);
        assertNotNull(updated);
        System.out.println(updated.toString());


    }
    @Test
    @Disabled
    public void d_delete() {
        assertTrue(repository.delete(organizer.getOrganizerID()));
        System.out.println("organizer deleted successfully");
    }

    @Test
    public void e_getAll() {

    }

}
