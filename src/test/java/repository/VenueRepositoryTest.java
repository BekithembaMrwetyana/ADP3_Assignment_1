package repository;
/* VenueRepositoryTest.java
   VenueRepositoryTest model class
   Author: Thimna Gogwana (222213973)
   Date: 27 March 2025
*/
import domain.Venue;
import factory.VenueFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.impl.VenueRepository;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VenueRepositoryTest {
    private IVenueRepository venueRepository;

    @BeforeEach
    public void setUp() {
        venueRepository = new VenueRepository();
    }

    @Test
    public void testAddAndGetVenue() {
        Venue venue = VenueFactory.createVenue("V001", "Conference Hall", "123 Main St");
        venueRepository.addVenue(venue);

        Venue retrievedVenue = venueRepository.getVenue("V001");
        assertNotNull(retrievedVenue);
        assertEquals("V001", retrievedVenue.getVenueID());
        assertEquals("Conference Hall", retrievedVenue.getName());
        assertEquals("123 Main St", retrievedVenue.getAddress());
    }

    @Test
    public void testGetAllVenues() {

        Venue venue1 = VenueFactory.createVenue("V001", "Conference Hall", "123 Main St");
        Venue venue2 = VenueFactory.createVenue("V002", "Auditorium", "456 Elm St");
        Venue venue3 = VenueFactory.createVenue("V003", "Banquet Hall", "789 Oak St");
        Venue venue4 = VenueFactory.createVenue("V004", "Outdoor Arena", "101 Pine St");
        Venue venue5 = VenueFactory.createVenue("V005", "Bar and Nightclub", "202 Maple Ave");
        Venue venue6 = VenueFactory.createVenue("V006", "Art Gallery", "303 Birch Blvd");
        Venue venue7 = VenueFactory.createVenue("V007", "Golf Course", "404 Cedar Ct");
        Venue venue8 = VenueFactory.createVenue("V008", "Museum", "505 Spruce Dr");


        venueRepository.addVenue(venue1);
        venueRepository.addVenue(venue2);
        venueRepository.addVenue(venue3);
        venueRepository.addVenue(venue4);
        venueRepository.addVenue(venue5);
        venueRepository.addVenue(venue6);
        venueRepository.addVenue(venue7);
        venueRepository.addVenue(venue8);


        List<Venue> venues = venueRepository.getAllVenues();
        assertEquals(8, venues.size());
    }

    @Test
    public void testUpdateVenue() {
        Venue venue = VenueFactory.createVenue("V001", "Conference Hall", "123 Main St");
        venueRepository.addVenue(venue);

        Venue updatedVenue = VenueFactory.createVenue("V001", "Updated Hall", "789 Oak St");
        venueRepository.updateVenue(updatedVenue);

        Venue retrievedVenue = venueRepository.getVenue("V001");
        assertEquals("Updated Hall", retrievedVenue.getName());
        assertEquals("789 Oak St", retrievedVenue.getAddress());
    }

    @Test
    public void testDeleteVenue() {
        Venue venue = VenueFactory.createVenue("V001", "Conference Hall", "123 Main St");
        venueRepository.addVenue(venue);

        venueRepository.deleteVenue("V001");
        Venue retrievedVenue = venueRepository.getVenue("V001");
        assertNull(retrievedVenue);
    }

    @Test
    public void testGetVenue_NotFound() {
        Venue retrievedVenue = venueRepository.getVenue("V999"); // Non-existent ID
        assertNull(retrievedVenue);
    }
}