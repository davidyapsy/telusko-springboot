package com.telusko.currConverter.service;

import com.telusko.currConverter.model.CurrencyConv;

public interface ICurrencyConvService {
	CurrencyConv getCurrency(String fromCountry, String ToCountry);
}
