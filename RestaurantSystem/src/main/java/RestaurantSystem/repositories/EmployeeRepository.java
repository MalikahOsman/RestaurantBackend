package RestaurantSystem.repositories;

import RestaurantSystem.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Osman on 2016-09-01.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
