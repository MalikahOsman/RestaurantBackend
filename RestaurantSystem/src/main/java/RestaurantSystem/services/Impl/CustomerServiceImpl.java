package RestaurantSystem.services.Impl;

import RestaurantSystem.domain.Customer;
import RestaurantSystem.repositories.CustomerRepository;
import RestaurantSystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository custRepo;

    @Override
    public Customer create(Customer entity)
    {
        return custRepo.save(entity);
    }

    @Override
    public Customer readById(Long aLong)
    {
        //return custRepo.findOne(aLong);
        return null;
    }

    @Override
    public Set<Customer> readAll() {
        Set<Customer> customers = new HashSet<>();
        while (custRepo.findAll().iterator().hasNext()){
            customers.add(custRepo.findAll().iterator().next());
        }
        return customers;
    }

    @Override
    public Customer update(Customer entity)
    {
        return null;
    }

    @Override
    public void delete(Customer entity)
    {
        //custRepo.delete(entity);
    }
}
