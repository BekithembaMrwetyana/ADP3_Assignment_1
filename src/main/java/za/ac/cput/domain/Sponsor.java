

package za.ac.cput.domain;

/*
Sponsor.java
Sponsor model class
Author : Thandolwethu p Mseleku(223162477)
Date:25 March 2025
 */
public class Sponsor {
    private String sponsorID;
    private String sponsorName;
    private double contributionAmount;

    private Sponsor() {
    }


    public Sponsor(Builder builder) {

        this.sponsorID = builder.sponsorID;
        this.sponsorName = builder.sponsorName;
        this.contributionAmount = builder.contributionAmount;
    }


    public String getSponsorID() {

        return sponsorID;
    }

    public String getSponsorName() {

        return sponsorName;
    }

    public double getContributionAmount() {

        return contributionAmount;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorID=" + sponsorID +
                ", sponsorName='" + sponsorName + '\'' +
                ", contributionAmount=" + contributionAmount +
                '}';
    }

    public static class Builder {
        private String sponsorID;
        private String sponsorName;
        private double contributionAmount;

        public Builder setSponsorID(String sponsorID) {
            this.sponsorID = sponsorID;
            return this;
        }

        public Builder setContributionAmount(double contributionAmount) {
            this.contributionAmount = contributionAmount;
            return this;
        }

        public Builder setSponsorName(String sponsorName) {
            this.sponsorName = sponsorName;
            return this;
        }

        public Builder copy(Sponsor sponsor) {

            this.sponsorID = sponsor.sponsorID;
            this.sponsorName = sponsor.sponsorName;
            this.contributionAmount = sponsor.contributionAmount;
            return this;
        }

        public Sponsor build() {

            return new Sponsor(this);
        }
    }
}
