package RestaurantSystem.factories;

import RestaurantSystem.domain.Customer;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Osman on 2016-09-01.
 */
public class TestCustomerFactory extends TestCase {
    public TestCustomerFactory(){}

    @Test
    public void testCreate()
    {
        HashMap<String, String> values = new HashMap<>();
        values.put("custNum", "001");
        values.put("custName", "Matthews");
        Customer customer = CustomerFactory.getCustomer(values);
        Assert.assertEquals("Matthews", customer.getCustName());
    }
}
