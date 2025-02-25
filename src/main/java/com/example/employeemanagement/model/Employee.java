package com.example.employeemanagement.model;
//Part of Jakarta Bean Validation API
import jakarta.validation.constraints.NotBlank; //Validates that a string field is not null and contains at least one non-whitespace character
import jakarta.validation.constraints.NotNull; //Validates that a value is not null
import jakarta.validation.constraints.Size; //Validates the size of a string field

public class Employee {
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Designation is required")
    @Size(max = 100, message = "Designation cannot exceed 100 characters")
    private String designation;

    @NotBlank(message = "Department is required")
    @Size(max = 100, message = "Department cannot exceed 100 characters")
    private String department;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(Long id, String name, String designation, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    // Getters and Setters
    public Long getId() {                      //Public getter for id field
        return id;
    }

    public void setId(Long id) {                //Public setter for id field
        this.id = id;
    }

    public String getName() {                    //Public getter for name field
        return name;
    }

    public void setName(String name) {           //Public settter for name field
        this.name = name;
    }

    public String getDesignation() {               //Public getter for designation field
        return designation;
    }

    public void setDesignation(String designation) { //Public setter for designation field
        this.designation = designation;
    }

    public String getDepartment() {
        return department;                     //Public getter for department field     
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
