package io.reactivestax.karate.controller;

import io.reactivestax.karate.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employeeList= new ArrayList<>();

    public EmployeeController(){
        employeeList.add(new Employee(1,"robin"));
        employeeList.add(new Employee(3,"demo"));
        employeeList.add(new Employee(2,"test-user1"));
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeList.get(id);
    }

    @PostMapping("/employees")
    public String getAllEmployees(@RequestBody Employee employee){
        employeeList.add(employee);
        return "Employee added";
    }
}
