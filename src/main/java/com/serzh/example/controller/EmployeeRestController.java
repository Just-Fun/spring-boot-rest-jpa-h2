package com.serzh.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serzh.example.entity.Employee;
import com.serzh.example.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employeeService.retrieveEmployees();
    }

    @GetMapping("/api/employees/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        Optional<Employee> employee = employeeService.getEmployee(employeeId);
        return employee.orElse(null);
//         .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    @PostMapping("/api/employees")
    public void saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
       log.info("Employee Saved Successfully");
    }

    @DeleteMapping("/api/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        log.info("Employee Deleted Successfully");
    }

    @PutMapping("/api/employees/{employeeId}")
    public void updateEmployee(@RequestBody Employee employee,
        @PathVariable(name = "employeeId") Long employeeId) {
        employeeService.getEmployee(employeeId)
            .ifPresent(employee1 -> employeeService.updateEmployee(employee));

    }

}
