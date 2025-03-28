/* Organizer factory class
Author: Abethu Ngxitho (221297820)
Date: 26/03/2025
 */


package factory;
import Helper.Helper;
import domain.Organizer;

import static Helper.Helper.*;


public class OrganizerFactory {

    public static Organizer createOrganizer(String organizerID, String name, String contactinfo) {
              if (organizerID == null || name == null || contactinfo ==null || name.isEmpty() || contactinfo.isEmpty())  {

                      throw new IllegalArgumentException("All fields must be provided!");
                  }

        return new Organizer.Builder()
                .setOrganizerID(organizerID)
                .setName(name)
                .setContactInfo(contactinfo)
                .build();
    }
}
