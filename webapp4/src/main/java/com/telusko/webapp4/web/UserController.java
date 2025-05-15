package com.telusko.webapp4.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.webapp4.dto.UserDto;
import com.telusko.webapp4.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService service;
	
	@GetMapping("/register")
	public String showRegistration(@ModelAttribute("user")UserDto userdto) {
		userdto.setId(service.rowCount()+1);
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(UserDto userdto, Model model) {
		String msg = service.addUser(userdto);
		model.addAttribute("message",msg);
		service.getAllUser().forEach(System.out::println);
		return "index";
	}
	
//	@GetMapping("/index")
//	public String showIndex() {	
//		return "index";
//	}
}
