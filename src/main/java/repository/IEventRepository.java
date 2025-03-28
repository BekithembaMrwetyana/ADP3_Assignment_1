package repository;

/*
IEventRepository.java
Event repository interface
Author: Bekithemba Mrwetyana (222707077)
Date: 24 March 2025
*/

import java.util.Set;

public interface IEventRepository<T, ID> {
    T create(T entity);
    T read(ID id);
    T update(T entity);
    boolean delete(ID id);
    Set<T> getAll();
}

