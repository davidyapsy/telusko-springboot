package com.telusko.webapp2.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("greeting")
public class GreetingService implements IGreetingService {
	@Autowired
	private LocalTime time;
	
	@Override
	public String getGreetings() {
		int hour = time.getHour();
		if(hour<12)
			return "Good morning";
		else if(hour<16)
			return "Good afternoon";
		else if(hour<20)
			return "Good evening";
		else
			return "Good night";
	}

}
