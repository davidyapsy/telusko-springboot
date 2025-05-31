package com.telusko.currConverter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.currConverter.model.CurrencyConv;
import com.telusko.currConverter.service.ICurrencyConvService;

@RestController
@RequestMapping("/currencyconv")
public class CurrencyConvController {

	@Autowired
	private ICurrencyConvService service;
	
	@GetMapping("/get-currency-amt/{fromCountry}/{toCountry}")
	public ResponseEntity<CurrencyConv> getCurrencyAmt(@PathVariable String fromCountry, @PathVariable String toCountry){
		CurrencyConv currencyConv = service.getCurrency(fromCountry, toCountry);
		return new ResponseEntity<CurrencyConv> (currencyConv, HttpStatus.OK);
	}
}
