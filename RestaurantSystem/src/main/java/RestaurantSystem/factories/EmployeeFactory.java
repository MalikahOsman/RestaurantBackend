package RestaurantSystem.factories;

import RestaurantSystem.domain.Chef;
import RestaurantSystem.domain.Employee;

import java.util.List;
import java.util.Map;

/**
 * Created by Osman on 2016-09-01.
 */
public class EmployeeFactory {
    //public EmployeeFactory(){}

    public static Employee getEmployee(Map<String,String> values)// , List<Chef> chefs)
    {
        Employee employee = new Employee
                .Builder()
                .empNum(values.get("empNum"))
                .empName(values.get("empName"))
                .address(values.get("address"))
                .telephone(values.get("tel"))
                //.chefs(chefs)
                .build();
        return employee;
    }
}
