package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchApp {
	
	@Autowired
	private Calculator calc;
	
	@GetMapping("/")
	public String show() {
		int n1 = 10;
		int n2 = 10;
		int result = calc.add(n1, n2);
		return "Welcome "+result;
	}
}
