package RestaurantSystem.client;

import RestaurantSystem.domain.Customer;
import RestaurantSystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService custService;

    /*------  Create an Employee  -------- */
    @RequestMapping(value = "/customer/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder){
        custService.create(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customer/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    /***********Retrieve a Single Employee**********/
    @RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
    public ResponseEntity<Customer> getMovie(@PathVariable("id") Long id){
        Customer customer = custService.readById(id);
        if (customer==null){
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }
    /**********Retrieve all Employees*********/
    @RequestMapping(value = "/customer/",method = RequestMethod.GET)
    public ResponseEntity<Set<Customer>> getCustomer(){
        Set<Customer> customer = custService.readAll();
        if (customer.isEmpty()){
            return new ResponseEntity<Set<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Set<Customer>>(customer,HttpStatus.OK);
    }

    /*************Update a movie*********/
    @RequestMapping(value = "/customer/",method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long id,@RequestBody Customer customer){
        Customer currentCustomer = custService.readById(id);
        if (currentCustomer==null){
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }

        Customer updatedCustomer = new Customer
                .Builder()
                .custNum(customer.getCustNum())
                .custName(customer.getCustName())
                .build();
        custService.update(updatedCustomer);
        return new ResponseEntity<Customer>(updatedCustomer,HttpStatus.OK);
    }
    /*************Delete a Employee************/
    @RequestMapping(value = "/customer/",method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id){
        Customer customer = custService.readById(id);
        if (customer==null){
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        custService.delete(customer);
        return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }
}
