package com.telusko.datajpa02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.datajpa02.service.TeacherService;

// CRUD repo
@SpringBootApplication
public class Datajpa02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa02Application.class, args);
		TeacherService ts = container.getBean(TeacherService.class);
		
	
	}

}
