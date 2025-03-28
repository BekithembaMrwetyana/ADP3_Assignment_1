/* Organizer FactoryT class
Author: Abethu Ngxitho (221297820)
Date: 27/03/2025
 */
package factory;

import domain.Organizer;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class OrganizerFactoryTest {
    private static Organizer organizer1 = OrganizerFactory.createOrganizer("Organizer_001","Richard Cosmo","+27 123 456 7890");
    private static Organizer organizer2 = OrganizerFactory.createOrganizer("Organizer_002","Roman Gilberto","+27 71 746 0314");
    private static Organizer organizer3 = OrganizerFactory.createOrganizer("Organizer_003","Moses Mbusha","+27 64 444 0673");

    @Test
    public void testCreateOrganizer() {
        assertNotNull(organizer1);
        System.out.println(organizer1.toString());

    }
    @Test
     public void testCreateOrganizerWithAllAttributes(){
        assertNotNull(organizer2);
        System.out.println(organizer2.toString());
     }
     @Test
    public void testCreateOrganizerThatFails() {
       // fail();
         assertNotNull(organizer3);
         System.out.println(organizer3.toString());
     }
    @Test
    @Disabled
    public void testNotImplementedYet() {
        //This test is disabledss

    }

}
