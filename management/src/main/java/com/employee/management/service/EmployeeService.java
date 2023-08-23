package com.employee.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String addEmployee(Employee emp ){
        this.employeeRepo.save(emp);
        return "Hi "+emp.getName()+" You are successfuly Registered";

    }
    public List<Employee> getAllEmployee(){
        return this.employeeRepo.findAll();

    }
    public List<Employee> findByEmail(String email){
        return this.employeeRepo.findByEmail(email);
    }
    public List<Employee> deleteEmployeeById(int id){
        this.employeeRepo.deleteById(id);
        return this.employeeRepo.findAll();

    }
    public Employee getEmployeeById(int id){
        return this.employeeRepo.findById(id).get();

    }
    
    
}
