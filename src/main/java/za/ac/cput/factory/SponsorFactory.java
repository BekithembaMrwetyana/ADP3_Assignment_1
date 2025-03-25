package za.ac.cput.factory;

import za.ac.cput.domain.Sponsor;
import za.ac.cput.util.Helper;
/*
*
* Sponsor.java
  Sponsor model class
  Author : Thandolwethu p Mseleku(223162477)
  Date:25 March 2025
 */

public class SponsorFactory {
    public static Sponsor createSponsor(String sponsorID, String sponsorName, double contributionAmount) {
        if (Helper.isNullorEmpty(sponsorID) || Helper.isNullorEmpty(sponsorName) || Helper.isValidDouble(contributionAmount)) {
            return null;
        }
        return new Sponsor.Builder()
                .setSponsorID(sponsorID)
                .setSponsorName(sponsorName)
                .setContributionAmount(contributionAmount).build();
    }


}
