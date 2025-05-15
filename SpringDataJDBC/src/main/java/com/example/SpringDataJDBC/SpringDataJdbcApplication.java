package com.example.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringDataJDBC.model.Employee;
import com.example.SpringDataJDBC.repo.EmployeeRepo;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);
		EmployeeRepo emp = container.getBean(EmployeeRepo.class);
		emp.insertEmployee(new Employee(4, "David4", "city4"));
		
	}

}
