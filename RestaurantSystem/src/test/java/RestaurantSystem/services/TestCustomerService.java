package RestaurantSystem.services;

import RestaurantSystem.App;
import RestaurantSystem.domain.Customer;
import RestaurantSystem.factories.CustomerFactory;
import RestaurantSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Osman on 2016-09-01.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCustomerService extends AbstractTestNGSpringContextTests{

    private Long id;
    @Autowired
    CustomerRepository custRepo;
    @Autowired
    CustomerService custService;

    @Test
    public void testCreate() throws Exception{
        Map<String, String> values = new HashMap<>();
        values.put("custNum", "001");
        values.put("custName", "Matthews");
        Customer customer = CustomerFactory.getCustomer(values);
        custRepo.save(customer);
        id = customer.getId();

        Assert.assertNotNull(customer);
    }

//    @Test(dependsOnMethods = "testCreate")
//    public void testDelete() throws Exception {
//        Customer customer = custRepo.findOne(id);
//        custRepo.delete(customer);
//        Customer c = custRepo.findOne(id);
//        Assert.assertNull(c);
//    }

}
