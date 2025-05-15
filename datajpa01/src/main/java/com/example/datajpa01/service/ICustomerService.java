package com.example.datajpa01.service;

import com.example.datajpa01.model.Customer;

public interface ICustomerService {
	void saveCustomer(Customer s);
	Iterable<Customer> saveCustomers(Iterable<Customer> s);
}
