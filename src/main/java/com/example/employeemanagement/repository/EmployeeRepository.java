package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {
    private final List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        // Adding mock data
        employees.add(new Employee(1L, "John Doe", "Software Engineer", "IT"));
        employees.add(new Employee(2L, "Jane Smith", "HR Manager", "Human Resources"));
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Optional<Employee> findById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }
}
