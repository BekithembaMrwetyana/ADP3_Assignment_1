package factory;
/* VenueFactoryTest.java
   VenueFactoryTest model class
   Author: Thimna Gogwana (222213973)
   Date: 27 March 2025
*/
import domain.Venue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VenueFactoryTest {

    @Test
    public void testCreateVenue_ValidInput_ConferenceHall() {
        Venue venue = VenueFactory.createVenue("V001", "Conference Hall", "123 Main St");

        assertNotNull(venue);
        assertEquals("V001", venue.getVenueID());
        assertEquals("Conference Hall", venue.getName());
        assertEquals("123 Main St", venue.getAddress());
    }

    @Test
    public void testCreateVenue_ValidInput_BarAndNightclub() {
        Venue venue = VenueFactory.createVenue("V002", "Bar and Nightclub", "202 Maple Ave");

        assertNotNull(venue);
        assertEquals("V002", venue.getVenueID());
        assertEquals("Bar and Nightclub", venue.getName());
        assertEquals("202 Maple Ave", venue.getAddress());
    }

    @Test
    public void testCreateVenue_ValidInput_ArtGallery() {
        Venue venue = VenueFactory.createVenue("V003", "Art Gallery", "303 Birch Blvd");

        assertNotNull(venue);
        assertEquals("V003", venue.getVenueID());
        assertEquals("Art Gallery", venue.getName());
        assertEquals("303 Birch Blvd", venue.getAddress());
    }

    @Test
    public void testCreateVenue_ValidInput_GolfCourse() {
        Venue venue = VenueFactory.createVenue("V004", "Golf Course", "404 Cedar Ct");

        assertNotNull(venue);
        assertEquals("V004", venue.getVenueID());
        assertEquals("Golf Course", venue.getName());
        assertEquals("404 Cedar Ct", venue.getAddress());
    }

    @Test
    public void testCreateVenue_ValidInput_Museum() {
        Venue venue = VenueFactory.createVenue("V005", "Museum", "505 Spruce Dr");

        assertNotNull(venue);
        assertEquals("V005", venue.getVenueID());
        assertEquals("Museum", venue.getName());
        assertEquals("505 Spruce Dr", venue.getAddress());
    }

    @Test
    public void testCreateVenue_NullVenueID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue(null, "Conference Hall", "123 Main St");
        });
        assertEquals("Venue ID must be provided and cannot be empty!", exception.getMessage());
    }

    @Test
    public void testCreateVenue_EmptyVenueID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue("", "Conference Hall", "123 Main St");
        });
        assertEquals("Venue ID must be provided and cannot be empty!", exception.getMessage());
    }

    @Test
    public void testCreateVenue_NullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue("V001", null, "123 Main St");
        });
        assertEquals("Venue name must be provided and cannot be empty!", exception.getMessage());
    }

    @Test
    public void testCreateVenue_EmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue("V001", "", "123 Main St");
        });
        assertEquals("Venue name must be provided and cannot be empty!", exception.getMessage());
    }

    @Test
    public void testCreateVenue_NullAddress() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue("V001", "Conference Hall", null);
        });
        assertEquals("Venue address must be provided and cannot be empty!", exception.getMessage());
    }

    @Test
    public void testCreateVenue_EmptyAddress() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VenueFactory.createVenue("V001", "Conference Hall", "");
        });
        assertEquals("Venue address must be provided and cannot be empty!", exception.getMessage());
    }
}