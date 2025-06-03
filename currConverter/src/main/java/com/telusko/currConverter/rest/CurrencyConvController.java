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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/currencyconv")
@Tag(
		name= "Currency Converter Controller", 
		description = "This API is to convert currency from one to another country."
		)
public class CurrencyConvController {

	@Autowired
	private ICurrencyConvService service;
	
	@GetMapping("/get-currency-amt/{fromCountry}/{toCountry}")
	@Operation(summary = "GET Operation", description="This API method will receive from and to country and provide the latest conversion rate.")
	public ResponseEntity<CurrencyConv> getCurrencyAmt(@PathVariable String fromCountry, @PathVariable String toCountry){
		CurrencyConv currencyConv = service.getCurrency(fromCountry, toCountry);
		return new ResponseEntity<CurrencyConv> (currencyConv, HttpStatus.OK);
	}
}
