package com.telusko.webapp1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaunchController1 {
	
	@RequestMapping("/welcome")
	public ModelAndView disp() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello World");
		mav.setViewName("index");
		return mav;
	}
}
