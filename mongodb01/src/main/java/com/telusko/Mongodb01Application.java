package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dto.CustomerDto;
import com.telusko.service.CustomerService;
import com.telusko.util.IDGenerator;

@SpringBootApplication
public class Mongodb01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Mongodb01Application.class, args);
	
		CustomerService cs = container.getBean(CustomerService.class);
//		cs.getAll().forEach(System.out::println);
//		String stat = cs.insertCustomer(new CustomerDto(IDGenerator.generateId(), 2, "david", "city", 20));
//		System.out.println(stat);
//		String stat = cs.update(new CustomerDto("b5753becfa", 2, "david2", "city", 20));
//		System.out.println(stat);
		String stat = cs.deleteById("b5753becfa");
		System.out.println(stat);
	}

}
