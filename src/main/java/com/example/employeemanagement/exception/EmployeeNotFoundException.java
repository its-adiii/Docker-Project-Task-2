package com.example.employeemanagement.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Employee not found with id: " + id);
    }
}
