package com.telusko.webapp6.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.webapp6.dto.CustomerDto;
import com.telusko.webapp6.service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/")
	public ResponseEntity<List<CustomerDto>> viewCustInfo() {
		List<CustomerDto> custDtoList = service.getCustomerInfo();
		return new ResponseEntity<List<CustomerDto>>(custDtoList, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto custDto) {
		service.saveCustomer(custDto);
		return new ResponseEntity<String>("Customer with name of "+ custDto.getName()+" has been successfully saved.", HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> updateCustomer(@RequestBody CustomerDto custDto) {
		service.saveCustomer(custDto);
		return new ResponseEntity<String> ("Record successfully updated", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(@RequestBody CustomerDto custDto) {
		service.deleteCustomer(custDto.getId());
		return new ResponseEntity<String> ("Record successfully removed", HttpStatus.OK);
	}
	
}
