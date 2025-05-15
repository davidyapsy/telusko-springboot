package com.example.datajpa04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.repo.IFurnitureRepo;
import com.example.datajpa04.view.View;

@Service
public class FurnitureService implements IFurnitureService {
	
	private IFurnitureRepo repo;
	@Autowired
	public void setRepo(IFurnitureRepo repo) {
		this.repo = repo;
	}
	@Override
	public <T extends View> List<T> fetchByManuYear(int year, Class<T> cls) {
		return repo.getByManuYear(year, cls);
	}
	@Override
	public int updateFurnitureName(String fName, Integer fId) {
		return repo.updateFurnitureName(fName, fId);
	}
	@Override
	public int addFurnitureNative(Integer id, Integer manuYear, String name) {
		return repo.insertFurnitureNative(id, manuYear, name);
	}
	@Override
	public int removeByName(String fName) {
		return repo.deleteByName(fName);
	}
	@Override
	public int addFurniture(Integer manuYear, String name) {
		return repo.insertFurniture(manuYear, name);
	}
	
}
