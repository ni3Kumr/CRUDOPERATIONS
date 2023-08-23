package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@CrossOrigin(origins="*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee emp) {
        return this.employeeService.addEmployee(emp);

    }

    @GetMapping("/Employee")
    public List<Employee> findAll() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/Employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return this.employeeService.getEmployeeById(id);
    }

    @GetMapping("/email/{email}")
    public List<Employee> getEmployeeByEmail(@PathVariable("email") String email) {
        return this.employeeService.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public List<Employee> deletEmployeesById(@PathVariable("id") int id) {
        this.employeeService.deleteEmployeeById(id);
        return employeeService.getAllEmployee();

    }

}
