package com.example.datajpa01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.datajpa01.model.Customer;
import com.example.datajpa01.model.Student;
import com.example.datajpa01.repo.ICustomerRepo;
import com.example.datajpa01.repo.IStudentRepo;

@Repository
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepo repo;

	@Override
	public void saveCustomer(Customer c) {
		repo.save(c);
	}

	@Override
	public Iterable<Customer> saveCustomers(Iterable<Customer> c) {
		return repo.saveAll(c);
	}
	
	
}
