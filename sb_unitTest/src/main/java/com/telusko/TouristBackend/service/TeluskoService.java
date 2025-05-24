package com.telusko.TouristBackend.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TeluskoService {
	
	public TeluskoService() {
		System.out.println("Telusko service bean created");
	}
}
