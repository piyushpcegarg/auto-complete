package com.piyushgarg.service;

import java.util.List;

import com.piyushgarg.model.Employee;
import com.piyushgarg.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private EmployeeRepository employeeRepository;

    public SearchService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> fetchEmployees(String name) {
        return employeeRepository.findByNameContainingIgnoreCase(name);
    }
     
}
