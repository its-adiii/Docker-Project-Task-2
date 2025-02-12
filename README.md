# Employee Management System

A simple Spring Boot application demonstrating REST API implementation with a mock employee database.

## Project Structure
```
src/main/java/com/example/employeemanagement/
├── EmployeeManagementApplication.java
├── controller
│   └── EmployeeController.java
├── model
│   └── Employee.java
├── repository
│   └── EmployeeRepository.java
└── service
    └── EmployeeService.java
```

## Features
- Get all employees
- Get employee by ID
- Mock data repository implementation
- MVC architecture

## API Endpoints

1. Get All Employees
   - URL: GET /api/employees
   - Response: List of all employees
   - Status Codes: 200 (Success), 500 (Server Error)

2. Get Employee by ID
   - URL: GET /api/employees/{id}
   - Response: Single employee details
   - Status Codes: 200 (Success), 404 (Not Found), 500 (Server Error)

## How to Run
1. Make sure you have Java 11 and Maven installed
2. Clone the repository
3. Navigate to the project directory
4. Run: `mvn spring-boot:run`
5. Access the API at `http://localhost:8080/api/employees`

## Sample Response
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "designation": "Software Engineer",
    "department": "IT"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "designation": "HR Manager",
    "department": "Human Resources"
  }
]
```




