package repository.impl;
  /*
 SponsorRepositoryTest.java
 SponsorRepsitoryTest model class
 Author : Thandolwethu phumelele Mseleku(223162477)
 Date: 27 March 2025
  */

import domain.Sponsor;
import factory.SponsorFactory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import repository.ISponsorRepository;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class SponsorRepositoryTest {
private static ISponsorRepository repository = SponsorRepository.getRepository();
private Sponsor sponsor = SponsorFactory.createSponsor("Thando Mseleku",500.00);


    @Test
    void create() {
       Sponsor created = repository.create(sponsor);
       assertNotNull(created);
        System.out.println(created.toString());


    }

    @Test
    void read() {

    Sponsor read = repository.read("Thando Mseleku");
    assertNotNull(read);
    System.out.println(read.toString());
    }

    @Test
    void update() {
    Sponsor newSponsor = new Sponsor.Builder().setSponsorName("Ntwenhle Duma").build();

    }

    @Test
    @Disabled
    void delete() {
    assertTrue(repository.delete(sponsor.getSponsorName()));
        System.out.println("Succesfully deleted");

    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());


    }
}