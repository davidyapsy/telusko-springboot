package com.telusko.service;

import java.util.List;

import com.telusko.dto.CustomerDto;
import com.telusko.model.Customer;

public interface ICustomerService {
	String insertCustomer(CustomerDto custDto);
	List<Customer> getAll();
	String deleteById(String id);
	String update(CustomerDto custDto);
}
