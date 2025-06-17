package com.telusko.kafkaSBPublisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.telusko.kafkaSBPublisher.model.Customer;
import com.telusko.kafkaSBPublisher.util.AppConstants;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, Customer> template;
	
	public void addCustomer(Customer customer) {
		template.send(AppConstants.TOPIC_NAME, customer);
	}
}
