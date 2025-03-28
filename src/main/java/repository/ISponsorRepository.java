package repository;
   /*
 ISponsorRepository.java
 ISponsorRepository model class
 Author : Thandolwethu p Mseleku(223162477)
 Date:25 March 2025
  */
import domain.Sponsor;

import java.util.List;

public interface ISponsorRepository extends IRepository<Sponsor, String> {
    List<Sponsor> getAll();

}
