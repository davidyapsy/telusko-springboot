package com.telusko.kafkaSBPublisher.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.kafkaSBPublisher.model.Customer;
import com.telusko.kafkaSBPublisher.service.KafkaService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private KafkaService kks;
	
	@PostMapping("add-customer")
	public ResponseEntity<String> addCust(@RequestBody Customer cust){
		kks.addCustomer(cust);
		return new ResponseEntity<String>("Customer added", HttpStatus.OK);
	}
}
