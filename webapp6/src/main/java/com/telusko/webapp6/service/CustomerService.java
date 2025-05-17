package com.telusko.webapp6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.webapp6.dto.CustomerDto;
import com.telusko.webapp6.model.Customer;
import com.telusko.webapp6.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public void saveCustomer(CustomerDto custDto) {
		Customer cust = new Customer();
		BeanUtils.copyProperties(custDto, cust);
		repo.save(cust);
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<CustomerDto> getCustomerInfo() {
		List<CustomerDto> custDtoList = new ArrayList<>();
		for(Customer cust: repo.findAll()) {
			CustomerDto custDto = new CustomerDto();
			BeanUtils.copyProperties(cust, custDto);
			custDtoList.add(custDto);
		}
		return custDtoList;
	}

	@Override
	public CustomerDto getCustomerById(int id) {
		CustomerDto custDto = new CustomerDto();
		BeanUtils.copyProperties(repo.findById(id).get(), custDto);
		return custDto;
	}

}
