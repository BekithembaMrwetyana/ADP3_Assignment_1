/* IOrganizer Repository class
Author: Abethu Ngxitho (221297820)
Date: 27/03/2025
 */
package repository;

import domain.Organizer;

public interface IOrganizerRepository<T, ID> {

        public Organizer create(T t);

        public Organizer read(ID id);

        public Organizer update(T t);

        boolean delete(ID id);

    }


