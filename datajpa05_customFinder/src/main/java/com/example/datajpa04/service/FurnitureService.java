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

@Service
public class FurnitureService implements IFurnitureService {
	
	private IFurnitureRepo repo;
	@Autowired
	public void setRepo(IFurnitureRepo repo) {
		this.repo = repo;
	}
	@Override
	public List<Furniture> searchByManuYear(int year) {
		return repo.findByManuYear(year);
	}
	@Override
	public List<Furniture> searchByNameStartingWith(String name) {
		return repo.findByNameStartingWith(name);
	}
	@Override
	public List<Furniture> searchByNameStartingWithAndManuYearBetween(String name, int minYear, int maxYear) {
		return repo.findByNameStartingWithAndManuYearBetween(name, minYear, maxYear);
	}
	@Override
	public List<Furniture> searchByManuYearCustom(int year) {
		return repo.getByManuYearCustom(year);
	}
	
}
