package com.sethu.employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        // Start the Spring container
        ApplicationContext context =
                SpringApplication.run(MainApplication.class, args);

        // Retrieve EmployeeManager from the Spring container
        EmployeeManager manager =
                context.getBean(EmployeeManager.class);

        // Display employee details
        manager.displayEmployee();

        // Shut down the Spring application
        //SpringApplication.exit(context, () -> 0);
    }
}
