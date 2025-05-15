package com.telusko.webapp5.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.webapp5.dto.CustomerDto;
import com.telusko.webapp5.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/")
	public String viewCustInfo(Model model) {
		model.addAttribute("customers", service.getCustomerInfo());
		return "index";
	}
	
	@GetMapping("/add")
	public String viewAdd(Model model) {
		model.addAttribute("customer", new CustomerDto());
		return "add";
	}
	
	@PostMapping("/add")
	public String addCustomer(CustomerDto custDto) {
		System.out.println(custDto);
		//service.saveCustomer(custDto);
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String viewUpdate(@RequestParam("id")int id, Model model) {
		model.addAttribute("customer", service.getCustomerById(id));
		return "update";
	}
	
	@PostMapping("/update")
	public String updateCustomer(CustomerDto custDto, Model model) {
		service.saveCustomer(custDto);
		return "redirect:/";
	}
		
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id")int id, Model model) {
		service.deleteCustomer(id);
		return "redirect:/";
	}
	
}
