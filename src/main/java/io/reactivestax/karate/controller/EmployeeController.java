package io.reactivestax.karate.controller;

import io.reactivestax.karate.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeController() {
        employeeList.add(new Employee(1, "robin"));
        employeeList.add(new Employee(3, "demo"));
        employeeList.add(new Employee(2, "test-user1"));
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeList.get(id);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public boolean deleteEmployee(@PathVariable Integer id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employeeList.remove(id);
            }
        }
        return false;
    }
}
