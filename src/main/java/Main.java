import domain.Venue;
import factory.VenueFactory;
import repository.IVenueRepository;
import repository.impl.VenueRepository;

import java.util.Optional;
/* Main.java
   Author: Thimna Gogwana (222213973)
   Date: 28 March 2025
*/
public class Main {

    public static void main(String[] args) {
        // Create a VenueRepository instance
        IVenueRepository venueRepository = new VenueRepository();

        // Create some venues using the VenueFactory
        Venue venue1 = VenueFactory.createVenue("1234", "Conference Hall", "123 Main St");
        Venue venue2 = VenueFactory.createVenue("5678", "Art Gallery", "456 Elm St");
        Venue venue3 = VenueFactory.createVenue("9101", "Bar and Nightclub", "789 Oak St");

        // Add venues to the repository
        venueRepository.create(venue1);
        venueRepository.create(venue2);
        venueRepository.create(venue3);

        // Read and display a venue
        Optional<Venue> retrievedVenue = venueRepository.read("1234");
        retrievedVenue.ifPresent(venue -> System.out.println("Retrieved Venue: " + venue));

        // Update a venue
        Venue updatedVenue = VenueFactory.createVenue("1234", "Updated Conference Hall", "321 Main St");
        venueRepository.update(updatedVenue);

        // Read and display the updated venue
        Optional<Venue> updatedRetrievedVenue = venueRepository.read("1234");
        updatedRetrievedVenue.ifPresent(venue -> System.out.println("Updated Venue: " + venue));

        // Delete a venue
        boolean isDeleted = venueRepository.delete("5678");
        System.out.println("Venue with ID 5678 deleted: " + isDeleted);

        // Try to read the deleted venue
        Optional<Venue> deletedVenue = venueRepository.read("5678");
        if (deletedVenue.isEmpty()) {
            System.out.println("Venue with ID 5678 not found.");
        }
    }
}
