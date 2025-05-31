package com.telusko.simplewebapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.simplewebapp.model.CurrencyConv;
import com.telusko.simplewebapp.service.ICurrencyConvService;

@RestController
public class CurrencyConvController {
	@Autowired
	private ICurrencyConvService service;
	
	@GetMapping("/get-rate")
	public ResponseEntity<CurrencyConv> getRate(@RequestParam String fromCountry, @RequestParam String toCountry){
		CurrencyConv curr = service.getRate(fromCountry, toCountry);
		return new ResponseEntity<CurrencyConv> (curr, HttpStatus.OK);
	}
}
