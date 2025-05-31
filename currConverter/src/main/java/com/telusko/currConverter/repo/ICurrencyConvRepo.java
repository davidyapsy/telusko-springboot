package com.telusko.currConverter.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.currConverter.model.CurrencyConv;

@Repository
public interface ICurrencyConvRepo extends JpaRepository<CurrencyConv, Integer> {
	CurrencyConv findByCFromAndCTo(String cFrom, String cTo);
}
