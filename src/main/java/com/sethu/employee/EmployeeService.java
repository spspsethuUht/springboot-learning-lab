package com.sethu.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String getEmployeeName() {
        return "Ravi Kumar";
    }

}
