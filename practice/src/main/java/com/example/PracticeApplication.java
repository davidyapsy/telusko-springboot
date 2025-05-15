package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.repo.EmployeeRepo;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(PracticeApplication.class, args);
		EmployeeRepo emp = container.getBean(EmployeeRepo.class);
		emp.getEmployee(1);
	}

}
