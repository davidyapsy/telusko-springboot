package com.example.datajpa03.service;

import com.example.datajpa03.model.Furniture;

public interface IFurnitureService {
	Iterable<Furniture> getAll(boolean status, String... properties);
	Iterable<Furniture> saveFurnitures(Iterable<Furniture> furnitures);
	void getAll(int pageSize, boolean status, String... properties);
}
