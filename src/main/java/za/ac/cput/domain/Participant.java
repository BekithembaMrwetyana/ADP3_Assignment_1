package za.ac.cput.domain;

public class Participant {
    private final String participantID;
    private final String name;
    private final String email;

    private Participant(Builder builder) {
        this.participantID = builder.participantID;
        this.name = builder.name;
        this.email = builder.email;
    }


    public String getParticipantID() {
        return participantID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Builder Class
    public static class Builder {
        private String participantID;
        private String name;
        private String email;

        public Builder participantID(String participantID) {
            this.participantID = participantID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Participant build() {
            return new Participant(this);
        }
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantID='" + participantID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
