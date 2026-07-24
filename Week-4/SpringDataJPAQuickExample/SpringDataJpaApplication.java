package com.cognizant;

import org.springframework.bootc.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee(1, "Rishikesh", 50000));
            repository.save(new Employee(2, "Rahul", 60000));

            System.out.println("Employee Records:");
            repository.findAll().forEach(employee ->
                    System.out.println(employee.getId() + " - " +
                            employee.getName() + " - " +
                            employee.getSalary()));
        };
    }
}