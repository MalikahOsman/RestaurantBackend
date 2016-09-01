package RestaurantSystem.services;

import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
public interface Service<E, ID> {

    E create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E update(E entity);

    void delete(E entity);
}

