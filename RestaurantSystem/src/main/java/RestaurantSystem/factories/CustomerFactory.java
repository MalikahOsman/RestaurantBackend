package RestaurantSystem.factories;

import RestaurantSystem.domain.Customer;

import java.util.Map;

/**
 * Created by Osman on 2016-09-01.
 */
public class CustomerFactory {
    public static Customer getCustomer(Map<String, String> values)
    {
        Customer customer = new Customer
                .Builder()
                .custNum(values.get("custNum"))
                .custName(values.get("custName"))
                .build();
         return customer;
    }
}
