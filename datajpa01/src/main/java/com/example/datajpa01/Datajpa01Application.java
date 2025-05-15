package com.example.datajpa01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.datajpa01.model.Customer;
import com.example.datajpa01.model.Student;
import com.example.datajpa01.service.CustomerService;
import com.example.datajpa01.service.StudentService;

@SpringBootApplication
public class Datajpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa01Application.class, args);
//		StudentService s= container.getBean(StudentService.class);
//		s.saveStudent(new Student(1, "david", 4.0));
		
//		List<Student> studList = new ArrayList<>();
//		studList.add(new Student(1, "davi1", 1.0));
//		studList.add(new Student(2, "davi2", 2.0));
//		studList.add(new Student(3, "davi3", 3.0));
//		
//		s.saveStudents(studList).forEach(System.out::println);
		
//		CustomerService cs = container.getBean(CustomerService.class);
//		cs.saveCustomer(new Customer("david", 10));
//
//		List<Customer> custList = new ArrayList<>();
//		custList.add(new Customer("davi1", 10));
//		custList.add(new Customer("davi2", 20));
//		custList.add(new Customer("davi3", 30));
//		
//		cs.saveCustomers(custList).forEach(System.out::println);
	}

}
