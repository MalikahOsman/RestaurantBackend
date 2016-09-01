package RestaurantSystem.client;

import RestaurantSystem.domain.Employee;
import RestaurantSystem.services.EmployeeService;
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
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    /*------  Create an Employee  -------- */
    @RequestMapping(value = "/employee/", method = RequestMethod.POST)
    public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, UriComponentsBuilder ucBuilder){
        empService.create(employee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(employee.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    /***********Retrieve a Single Employee**********/
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public ResponseEntity<Employee> getMovie(@PathVariable("id") Long id){
        Employee employee = empService.readById(id);
        if (employee==null){
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Employee>(employee,HttpStatus.OK);
    }
    /**********Retrieve all Employees*********/
    @RequestMapping(value = "/employees/",method = RequestMethod.GET)
    public ResponseEntity<Set<Employee>> getEmployee(){
        Set<Employee> employee = empService.readAll();
        if (employee.isEmpty()){
            return new ResponseEntity<Set<Employee>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Set<Employee>>(employee,HttpStatus.OK);
    }

    /*************Update a movie*********/
    @RequestMapping(value = "/employee/",method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateMovie(@PathVariable("id") Long id,@RequestBody Employee employee){
        Employee currentEmployee = empService.readById(id);
        if (currentEmployee==null){
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

        Employee updatedEmployee = new Employee
                .Builder()
                .empNum(employee.getEmpNum())
                .empName(employee.getEmpName())
                .address(employee.getAddress())
                .telephone(employee.getTelephone())
                .build();
        empService.update(updatedEmployee);
        return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.OK);
    }
    /*************Delete a Employee************/
    @RequestMapping(value = "/employee/",method = RequestMethod.DELETE)
    public ResponseEntity<Employee> deleteMovie(@PathVariable("id") Long id){
        Employee employee = empService.readById(id);
        if (employee==null){
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
        empService.delete(employee);
        return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
    }

}
