package com.telusko.TouristBackend.service;

import java.util.List;

import com.telusko.TouristBackend.model.Tourist;

public interface ITouristService {
	Tourist getTouristById(int id);
	List<Tourist> getAllTourist();
	String addTourist(Tourist tourist);
	String updateTourist(Tourist tourist);
	String updateTouristAmtPaid(int id, double amtPaid);
	String deleteTouristById(int id);
}
