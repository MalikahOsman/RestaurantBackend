package RestaurantSystem.services;

import RestaurantSystem.App;
import RestaurantSystem.domain.Chef;
import RestaurantSystem.domain.Employee;
import RestaurantSystem.factories.EmployeeFactory;
import RestaurantSystem.model.EmployeeResource;
import RestaurantSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Osman on 2016-09-01.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestEmployeeService extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    EmployeeRepository empRepo;
    @Autowired
    EmployeeService empService;

    //List<Chef> chefList;
    @Test
    public void testCreate() throws Exception{
        Map<String, String> values = new HashMap<>();
        values.put("empNum", "0123");
        values.put("empName", "Malikah");
        values.put("address", "Cape Town");
        values.put("tel", "0214483055");
        Employee employee = EmployeeFactory.getEmployee(values);//, chefList);
        empRepo.save(employee);
        id = employee.getId();

        Assert.assertNotNull(employee);

    }

    /*@Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        Employee employee = empRepo.findOne(id);
        empRepo.delete(employee);
        Employee e = empRepo.findOne(id);
        Assert.assertNull(e);
    }*/

}
