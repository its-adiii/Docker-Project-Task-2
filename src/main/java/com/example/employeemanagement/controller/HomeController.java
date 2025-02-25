package com.example.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Welcome to Employee Management System API. Use /api/employees to access the employee endpoints.";
    }
}
