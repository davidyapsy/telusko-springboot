package com.example.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringJDBC.repo.EmployeeRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeRepo emp = container.getBean(EmployeeRepo.class);
		emp.getEmployee().forEach(System.out::println);
	}

}
