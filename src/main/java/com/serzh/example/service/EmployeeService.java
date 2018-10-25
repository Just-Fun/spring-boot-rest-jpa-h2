package com.serzh.example.service;

import java.util.List;
import java.util.Optional;

import com.serzh.example.entity.Employee;

public interface EmployeeService {

    List<Employee> retrieveEmployees();

    Optional<Employee> getEmployee(Long employeeId);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long employeeId);

    void updateEmployee(Employee employee);
}
