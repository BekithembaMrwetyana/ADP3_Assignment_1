/* Organizer builder class
Author: Abethu Ngxitho (221297820)
Date: 26/03/2025
 */
package domain;

public class Organizer {

    private String organizerID;
    private String name;
    private String contactInfo;

    private Organizer() {

    }
    public Organizer(Builder builder ) {
        this.organizerID = builder.organizerID;
        this.name = builder.name;
        this.contactInfo = builder.contactInfo;
    }

    public static boolean isNullOrEmpty(String organizerID) {
        return false;
    }

    public String getOrganizerID() {

        return organizerID;
    }

    public String getName() {

        return name;
    }

    public String getContactInfo() {

        return contactInfo;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "organizerID='" + organizerID + '\'' +
                ", Name='" + name + '\'' +
                ", ContactInfo='" + contactInfo + '\'' +
                '}';
    }
    public static class Builder {

        private String organizerID;
        private String name;
        private String contactInfo;

        public Builder setOrganizerID(String organizerID) {
            this.organizerID = organizerID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public Builder copy(Organizer organizer) {
            this.organizerID = organizer.organizerID;
            this.name = organizer.name;
            this.contactInfo = organizer.contactInfo;
            return this;
        }

        public Organizer build() {
            return new Organizer(this);

        }
    }
}
