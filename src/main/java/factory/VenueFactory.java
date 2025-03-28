package factory;
/* VenueFactory.java
   VenueFactory model class
   Author: Thimna Gogwana (222213973)
   Date: 25 March 2025
*/
import domain.Venue;

public class VenueFactory {
    public static Venue createVenue(String venueID, String name, String address) {

        if (venueID == null || venueID.isEmpty()) {
            throw new IllegalArgumentException("Venue ID must be provided and cannot be empty!");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Venue name must be provided and cannot be empty!");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Venue address must be provided and cannot be empty!");
        }


        return new Venue.Builder()
                .venueID(venueID)
                .name(name)
                .address(address)
                .build();
    }
}