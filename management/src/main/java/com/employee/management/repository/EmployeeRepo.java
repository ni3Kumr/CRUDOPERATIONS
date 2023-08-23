package com.employee.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.entity.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{
    public List<Employee> findByEmail(String email);
    
}
