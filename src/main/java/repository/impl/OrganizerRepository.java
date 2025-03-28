/* Organizer factory class
Author: Abethu Ngxitho (221297820)
Date: 27/03/2025
 */
package repository.impl;

import domain.Organizer;
import domain.Participant;
import repository.IOrganizerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public  class OrganizerRepository implements IOrganizerRepository<Organizer, String> {
    private  Map<String, Organizer> organizerMap = new HashMap<>();

    private static  OrganizerRepository organizerRepository = null;

    public OrganizerRepository() {
        this.organizerMap = new HashMap<>();
    }

    public static OrganizerRepository getOrganizerRepository() {
        if (organizerRepository == null) {
            organizerRepository = new OrganizerRepository();

        }
        return organizerRepository;
    }
    @Override
    public Organizer create(Organizer organizer) {
        if(organizer != null) {
            organizerMap.put(organizer.getOrganizerID(), organizer);
            return organizer;
        }
        return null;

    }

    @Override
    public Organizer read(String organizerID) {
        return organizerMap.get(organizerID);

    }

    @Override
    public Organizer update(Organizer organizer) {
        if (organizer == null || !organizerMap.containsKey(organizer.getOrganizerID())) {
            return null;
        }
        organizerMap.put(organizer.getOrganizerID(), organizer );
        return organizer;
    }

    @Override
    public boolean delete(String organizerID) {
        return organizerMap.remove(organizerID) != null;

    }

}
