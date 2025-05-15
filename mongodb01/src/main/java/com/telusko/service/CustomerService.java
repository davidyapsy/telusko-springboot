package com.telusko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dto.CustomerDto;
import com.telusko.model.Customer;
import com.telusko.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String insertCustomer(CustomerDto custDto) {
		Customer cust = new Customer();
		BeanUtils.copyProperties(custDto, cust);
		Customer retCust = repo.save(cust);
		return "Customer with id= "+retCust.getId()+" has been added";
	}
	
	@Override
	public List<Customer> getAll(){
//		List<CustomerDto> custDtoList = new ArrayList<>();
//		BeanUtils.copyProperties(repo.findAll(), custDtoList);
//		repo.findAll().forEach(v -> System.out.println(v));
		return repo.findAll();
	}
	
	@Override
	public String deleteById(String id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "Record has been deleted successfully";
		}
		return "Record not found";
	}
	
	@Override
	public String update(CustomerDto custDto) {
		Customer cust = new Customer();
		BeanUtils.copyProperties(custDto, cust);
		Customer retCust = repo.save(cust);
		return "Record with id= "+retCust.getId()+ " successfully updated";
	}
}
