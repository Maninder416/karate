package io.reactivestax.karate.service;

import io.reactivestax.karate.Model.Employee;
import io.reactivestax.karate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public String findEmployee(Long id){
        Optional<Employee> employee= employeeRepository.findById(id);

        if(employee.isPresent()){
            return employeeRepository.findById(id).toString();
        }
        return "Employee not found for id: "+id;
    }

    public List<Employee> findAll(){
        List<Employee> employeeList= employeeRepository.findAll();
        if(employeeList.isEmpty()){
            throw new RuntimeException("No employee found");
        }
        return employeeList;
    }

    public String deleteEmployee(Long id){
        Optional<Employee> employee= employeeRepository.findById(id);
        if(employee.isPresent()){
            employeeRepository.deleteById(id);
            return "Employee deleted";
        }
        return "Employee not found for id: "+id;
    }
}
