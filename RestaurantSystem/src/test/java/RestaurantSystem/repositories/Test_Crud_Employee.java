package RestaurantSystem.repositories;

import RestaurantSystem.App;
import RestaurantSystem.domain.Chef;
import RestaurantSystem.domain.Employee;
import RestaurantSystem.factories.EmployeeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Osman on 2016-09-01.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class Test_Crud_Employee extends AbstractTestNGSpringContextTests{

    @Autowired
    private EmployeeRepository empRepo;
   // List<Chef> chefList;
    private Long id;

    @Test
    public void testCreate() throws Exception {
        HashMap<String, String> values = new HashMap<>();
        values.put("empNum", "0123");
        values.put("empName", "Malikah");
        values.put("address", "Cape Town");
        values.put("tel", "0214483055");

        /*Chef chef = new Chef.Builder()
                .userName("123")
                .password("123")
                .id(123L)
                .build();
        chefList.add(chef);*/
        Employee employee = EmployeeFactory.getEmployee(values);//, chefList);

        empRepo.save(employee);
        id = employee.getId();
        Assert.assertNotNull(employee.getId());

    }


    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Employee employee = empRepo.findOne(id);
        Assert.assertEquals("Malikah", employee.getEmpName());

    }
//
    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Employee employee = empRepo.findOne(id);
        Employee newEmployee = new Employee
                .Builder()
                .empName("Malikah")
                .empNum("0123")
                .telephone("021-9856-874")
                .address("Cape Town")
                .build();
         empRepo.save(newEmployee);
        Assert.assertEquals("Malikah", newEmployee.getEmpName());
        Assert.assertEquals("0123", newEmployee.getEmpNum());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Employee employee = empRepo.findOne(id);
        empRepo.delete(employee);
        Employee newEmployee = empRepo.findOne(id);
        Assert.assertNull(newEmployee);

    }


}
