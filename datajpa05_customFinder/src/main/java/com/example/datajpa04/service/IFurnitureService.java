package com.example.datajpa04.service;

import java.util.List;

import com.example.datajpa04.model.Furniture;

public interface IFurnitureService {
	List<Furniture> searchByManuYear(int year);
	List<Furniture> searchByNameStartingWith (String name);
	List<Furniture> searchByNameStartingWithAndManuYearBetween (String name, int minYear, int maxYear);
	List<Furniture> searchByManuYearCustom(int year);

}
