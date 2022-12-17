package io.reactivestax.karate.controller;

import io.reactivestax.karate.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employeeList= Arrays.asList(new Employee(1,"robin"),
            new Employee(2,"test-user1"));

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeList.get(id);
    }
}
