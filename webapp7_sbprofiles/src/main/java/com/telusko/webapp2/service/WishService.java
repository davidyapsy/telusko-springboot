package com.telusko.webapp2.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("wish")
public class WishService implements IGreetingService {
	@Autowired
	private LocalTime time;
	
	@Override
	public String getGreetings() {
		int hour = time.getHour();
		return "Good morning";
		
	}

}
