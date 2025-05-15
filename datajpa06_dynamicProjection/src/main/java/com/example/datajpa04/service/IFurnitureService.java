package com.example.datajpa04.service;

import java.util.List;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.view.View;

public interface IFurnitureService {
	<T extends View> List<T> searchByManuYearGreaterThan(int year, Class<T> cls);
}
