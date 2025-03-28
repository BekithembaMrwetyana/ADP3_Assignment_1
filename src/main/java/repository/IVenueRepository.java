package repository;
/* IVenueRepository.java
   Author: Thimna Gogwana (222213973)
   Date: 26 March 2025
*/
import domain.Venue;
import java.util.Optional;
import java.util.List;

public interface IVenueRepository {
    Venue create(Venue venue); // Method to create a new Venue
    Optional<Venue> read(String venueID); // Method to read a Venue by its ID
    Venue update(Venue venue); // Method to update an existing Venue
    boolean delete(String venueID); // Method to delete a Venue by its ID
}