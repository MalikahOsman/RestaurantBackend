package RestaurantSystem.repositories;

import RestaurantSystem.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Osman on 2016-09-01.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
