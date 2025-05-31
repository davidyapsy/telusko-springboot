package com.telusko.currConverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.currConverter.model.CurrencyConv;
import com.telusko.currConverter.repo.ICurrencyConvRepo;

@Service
public class CurrencyConvService implements ICurrencyConvService {

	@Autowired
	private ICurrencyConvRepo repo;
	
	@Override
	public CurrencyConv getCurrency(String fromCountry, String ToCountry) {
		return repo.findByCFromAndCTo(fromCountry, ToCountry);
	}

}
