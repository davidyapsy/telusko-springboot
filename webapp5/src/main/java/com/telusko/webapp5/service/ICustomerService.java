package com.telusko.webapp5.service;

import java.util.List;

import com.telusko.webapp5.dto.CustomerDto;

public interface ICustomerService {
	void saveCustomer(CustomerDto custDto);
	void deleteCustomer(int id);
	List<CustomerDto> getCustomerInfo();
	CustomerDto getCustomerById(int id);
}
