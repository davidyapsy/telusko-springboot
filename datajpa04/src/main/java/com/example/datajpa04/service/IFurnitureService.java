package com.example.datajpa04.service;

import java.util.List;

import com.example.datajpa04.model.Furniture;

public interface IFurnitureService {
	Iterable<Furniture> getAll(boolean status, String... properties);
	Iterable<Furniture> saveFurnitures(Iterable<Furniture> furnitures);
	void getAll(int pageSize, boolean status, String... properties);
	
	Furniture getRefById(int id);
	String removeByIds(List<Integer> ids);
}
