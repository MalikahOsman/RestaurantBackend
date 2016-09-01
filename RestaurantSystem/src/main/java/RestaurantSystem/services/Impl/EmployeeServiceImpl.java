package RestaurantSystem.services.Impl;

import RestaurantSystem.domain.Employee;
import RestaurantSystem.repositories.EmployeeRepository;
import RestaurantSystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    @Override
    public Employee create(Employee entity) {
        return empRepo.save(entity);
    }

//    public List<Employee> getEmployee(){
//        List<Employee> employees = new ArrayList<Employee>();
//
//        Iterable<Employee> items = empRepo.findAll();
//        for(Employee emp : employees){
//            employees.add(emp);
//        }
//        return employees;
//    }

    @Override
    public Employee readById(Long aLong) {
        //return empRepo.findOne(aLong);
        return null;
    }

    @Override
    public Set<Employee> readAll() {
        Set<Employee> employees = new HashSet<>();
        while (empRepo.findAll().iterator().hasNext()){
            employees.add(empRepo.findAll().iterator().next());
        }
        return employees;
    }

    @Override
    public Employee update(Employee entity) {
//        return empRepo.save(entity);
        return null;
    }

    @Override
    public void delete(Employee entity) {
//        empRepo.delete(entity);

    }
}