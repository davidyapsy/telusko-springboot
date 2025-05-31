package com.telusko.simplewebapp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.telusko.simplewebapp.model.CurrencyConv;

@Service
public class CurrencyConvService implements ICurrencyConvService {
	private String url = "http://localhost:6969/currconverterapp/currencyconv";
	
	@Override
	public CurrencyConv getRate(String fromCountry, String toCountry) {
		String methodName = "/get-currency-amt";
//		RestTemplate restTemplate = new RestTemplate();
//		System.out.println(url + "/"+fromCountry+"/"+toCountry);
//		ResponseEntity<CurrencyConv> response
//		  = restTemplate.getForEntity(url + methodName + "/" + fromCountry + "/" + toCountry, CurrencyConv.class);
//		CurrencyConv curr = response.getBody();
		
		WebClient webClient = WebClient.create(url);
		CurrencyConv curr = webClient.get()
				.uri(uriBuilder -> uriBuilder
						.path("/get-currency-amt/{fromCountry}/{toCountry}")
						.build(fromCountry, toCountry))
				.retrieve()
				.bodyToMono(CurrencyConv.class)
				.block();
		//Notes: Block to make it sync method
		return curr;
	}

}
