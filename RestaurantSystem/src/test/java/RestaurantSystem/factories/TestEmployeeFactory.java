package RestaurantSystem.factories;

import RestaurantSystem.domain.Chef;
import RestaurantSystem.domain.Employee;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Osman on 2016-09-01.
 */
public class TestEmployeeFactory extends TestCase {

    //List<Chef> chefList;
    public TestEmployeeFactory(){}

    @Test
    public void testCreate(){
        HashMap<String, String> values = new HashMap<>();
        values.put("empNum", "0123");
        values.put("empName", "Malikah");
        values.put("address", "Cape Town");
        values.put("tel", "0214483055");
        Employee employee = EmployeeFactory.getEmployee(values);//, chefList);
        Assert.assertEquals("Malikah", employee.getEmpName());


    }
}
