package com.example.junitTestSpringBoot.service;

import com.example.junitTestSpringBoot.entity.Employee;
import com.example.junitTestSpringBoot.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceImp {
    Employee saveEmployee(Employee employee) throws ResourceNotFoundException;
    List<Employee> getAllEmployee();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(long id);

}
