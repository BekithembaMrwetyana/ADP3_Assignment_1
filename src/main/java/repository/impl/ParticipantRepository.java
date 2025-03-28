/* Participant repository class
Author: Mpilonhle Zimela Mzimela (2301978833)
Date: 26/03/2025
 */


package repository.impl;

import domain.Participant;
import repository.IParticipantRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParticipantRepository implements IParticipantRepository<Participant, String> {
    private final Map<String, Participant> participantMap = new HashMap<>();

    @Override
    public Participant create(Participant participant) {
        participantMap.put(participant.getParticipantID(), participant);
        return participant;
    }

    @Override
    public Optional<Participant> read(String id) {
        return Optional.ofNullable(participantMap.get(id));
    }

    @Override
    public Participant update(Participant participant) {
        if (participantMap.containsKey(participant.getParticipantID())) {
            participantMap.put(participant.getParticipantID(), participant);
            return participant;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        return participantMap.remove(id) != null;
    }


    public Map<String, Participant> getAll() {
        return new HashMap<>(participantMap); // Return a copy to avoid direct modification
    }
}
