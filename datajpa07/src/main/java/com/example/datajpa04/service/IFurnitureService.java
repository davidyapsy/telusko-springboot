package com.example.datajpa04.service;

import java.util.List;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.view.View;

public interface IFurnitureService {
	<T extends View> List<T> fetchByManuYear(int year, Class<T> cls);
	int updateFurnitureName(String fName, Integer fId);
	int addFurnitureNative(Integer id, Integer manuYear, String name);
	int addFurniture(Integer manuYear, String name);
	int removeByName(String fName);
}
