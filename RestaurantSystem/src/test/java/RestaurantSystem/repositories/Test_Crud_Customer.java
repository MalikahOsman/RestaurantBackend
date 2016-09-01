package RestaurantSystem.repositories;

import RestaurantSystem.App;
import RestaurantSystem.domain.Customer;
import RestaurantSystem.factories.CustomerFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;

import java.util.HashMap;

/**
 * Created by Osman on 2016-09-01.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class Test_Crud_Customer extends AbstractTestNGSpringContextTests {

    @Autowired
    private CustomerRepository custRepo;

    private Long id;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("custNum", "001");
        values.put("custName", "Matthews");

        Customer customer = CustomerFactory.getCustomer(values);
        custRepo.save(customer);
        id = customer.getId();
        Assert.assertNotNull(customer.getId());

    }
/*
*  @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("empNum", "0123");
        values.put("empName", "Malikah");
        values.put("address", "Cape Town");
        values.put("tel", "0214483055");


Employee employee = EmployeeFactory.getEmployee(values);//, chefList);

        empRepo.save(employee);
    id = employee.getId();
        Assert.assertNotNull(employee.getId());

}
* */
}
