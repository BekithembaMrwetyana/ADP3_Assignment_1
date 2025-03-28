package repository;
   /*
 IRepository.java
 Irepository model class
 Author : Thandolwethu p Mseleku(223162477)
 Date:25 March 2025
  */

public interface IRepository<T, ID> {
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);
}

