package com.telusko.webapp2.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.webapp2.service.IGreetingService;

@Controller
@RequestMapping("/controller1")
public class GreetingController1 {
	@Autowired
	private IGreetingService greeting;
	
	@GetMapping("/greet1")
	public String getGreeting(Model model) {
		String res = greeting.getGreetings();
		model.addAttribute("message", res);
		return "greet";
	}
	
//	@GetMapping("/greet")
//	public void getGreeting1(Map<String, Object> map) {
//		String res = greeting.getGreetings();
//		map.put("message", res);
//		return;
//	}
//	
//	@RequestMapping("/")
//	public String home() {
//		return "Welcome Home";
//	}
}
