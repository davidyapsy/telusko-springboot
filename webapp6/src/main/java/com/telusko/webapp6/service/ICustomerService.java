package com.telusko.webapp6.service;

import java.util.List;

import com.telusko.webapp6.dto.CustomerDto;

public interface ICustomerService {
	void saveCustomer(CustomerDto custDto);
	void deleteCustomer(int id);
	List<CustomerDto> getCustomerInfo();
	CustomerDto getCustomerById(int id);
}
