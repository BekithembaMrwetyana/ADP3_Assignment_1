package factory;
   /*
 SponsorFactroyTest.java
 SponsorFactoryTest model class
 Author : Thandolwethu p Mseleku(223162477)
 Date:25 March 2025
  */
import domain.Sponsor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SponsorFactoryTest {

    @Test
    void createSponsor() {
        Sponsor sponsor = SponsorFactory.createSponsor("Thandolwethu Mseleku", 200);
        assertNotNull(sponsor);
        System.out.println("Employee details:" + sponsor.toString());
    }

    @Test
    void createSponsorWithInvalidName() {
        Sponsor sponsor = SponsorFactory.createSponsor("", 200);
        assertNull(sponsor);
        System.out.println("Employee details:" + sponsor);
    }

    @Test
    void createSponsorWithInvalidAmount() {
        Sponsor sponsor = SponsorFactory.createSponsor("Thandolwethu Mseleku", -1);
        assertNull(sponsor);
        System.out.println("Employee details:" + sponsor);
    }


}