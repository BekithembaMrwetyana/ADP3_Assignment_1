package repository.impl;
   /*
 SponsorRepository.java
 SponsorRepsitory model class
 Author : Thandolwethu p Mseleku(223162477)
 Date:25 March 2025
  */

import domain.Sponsor;
import org.w3c.dom.ls.LSOutput;
import repository.ISponsorRepository;

import java.util.ArrayList;
import java.util.List;

public class SponsorRepository implements ISponsorRepository {
    private static ISponsorRepository repository = null;
    private List<Sponsor> sponsorList;

    private SponsorRepository() {

        sponsorList = new ArrayList<Sponsor>();
    }

    public static ISponsorRepository getRepository() {

        if (repository == null) {
            repository = new SponsorRepository();
        }
        return repository;
    }

    @Override
    public Sponsor create(Sponsor sponsor) {
        boolean success = sponsorList.add(sponsor);
        if (success) {
            return sponsor;
        }
        return null;


    }


    @Override
    public Sponsor read(String s) {
        for (Sponsor sponsor : sponsorList) {
            if (sponsor.getSponsorName().equals(s))
                return sponsor;
        }
        return null;
    }


    @Override
    public Sponsor update(Sponsor sponsor) {
        String sponsorName = sponsor.getSponsorName();
        Sponsor sponsorOld = read(sponsorName);
        if (sponsorOld == null)
            return null;
        boolean success = delete(sponsorName);
        if (success) {
            if (sponsorList.add(sponsor))
                return sponsor;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Sponsor SponsorToDelete = read(s);
        if (SponsorToDelete == null)
            return false;
        return (sponsorList.remove(SponsorToDelete));
    }

    @Override
    public List<Sponsor> getAll() {
        return null;
    }
}

