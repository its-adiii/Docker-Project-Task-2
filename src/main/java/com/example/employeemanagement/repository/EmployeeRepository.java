package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee; //Imports the Employee class from model package
import org.springframework.stereotype.Repository;  //Imports Spring's Repository

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;  //Container object for nullable values

@Repository                 //Marks the class as a repository
public class EmployeeRepository {
    private final List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        // Adding mock data
        employees.add(new Employee(1L, "John Doe", "Software Engineer", "IT"));
        employees.add(new Employee(2L, "Jane Smith", "HR Manager", "Human Resources"));
        employees.add(new Employee(3L, "Bob Johnson", "Project Manager", "Project Management"));
        employees.add(new Employee(4L, "Alice Brown", "Marketing Specialist", "Marketing"));
        employees.add(new Employee(5L, "David Lee", "Data Analyst", "Data Science"));
        employees.add(new Employee(2L, "Adish Gujarathi", "Intern", "IT"));
        employees.add(new Employee(2L, "Amritesh Bhoyar", "Intern", "IT"));
    }

    public List<Employee> findAll() {           //Returns entire collection
                                                // No filtering or processing
        return employees;
    }

    public Optional<Employee> findById(Long id) {   //Returns an optional employee
        return employees.stream()
                .filter(employee -> employee.getId().equals(id)) //Lambda operator is used here to filter emp based on ID match
                .findAny();  
    }
}
