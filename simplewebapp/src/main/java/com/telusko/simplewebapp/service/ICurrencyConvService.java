package com.telusko.simplewebapp.service;

import com.telusko.simplewebapp.model.CurrencyConv;

public interface ICurrencyConvService {
	CurrencyConv getRate(String fromCountry, String toCountry);
}
