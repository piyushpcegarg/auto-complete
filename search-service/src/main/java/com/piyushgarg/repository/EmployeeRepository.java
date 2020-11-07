package com.piyushgarg.repository;

import java.util.List;

import com.piyushgarg.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByNameContainingIgnoreCase(String name);
    
}
