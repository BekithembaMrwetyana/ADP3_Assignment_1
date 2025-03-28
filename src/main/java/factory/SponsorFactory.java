package factory;

import domain.Sponsor;
import util.Helper;

public class SponsorFactory {
    public static Sponsor createSponsor(String sponsorName, double contributionAmount) {
        String sponsorID=Helper.generateId();
        if (Helper.isNullOrEmpty(sponsorID) || Helper.isNullOrEmpty(sponsorName) || contributionAmount <= 0) {
            return null;
        }
        return new Sponsor.Builder()
                .setSponsorID(sponsorID)
                .setSponsorName(sponsorName)
                .setContributionAmount(contributionAmount).build();
    }
}

