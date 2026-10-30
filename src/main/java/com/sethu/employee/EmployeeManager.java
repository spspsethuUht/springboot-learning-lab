package com.sethu.employee;

import org.springframework.stereotype.Component;

@Component

public class EmployeeManager {

    private final EmployeeService employeeService;

    // Constructor Injection
    public EmployeeManager(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void displayEmployee() {
        System.out.println(
                "Employee Name: " + employeeService.getEmployeeName()
        );
    }
}
