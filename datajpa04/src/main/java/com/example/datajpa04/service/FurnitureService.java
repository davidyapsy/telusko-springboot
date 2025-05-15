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
	public Iterable<Furniture> getAll(boolean status, String... properties) {
		Sort sort = Sort.by(Direction.ASC, properties);
		if(!status) {
			sort = Sort.by(Direction.DESC, properties);
		}

		return repo.findAll(sort);
	}
	
	@Override
	public void getAll(int pageSize, boolean status, String... properties) {
		Sort sort = Sort.by(status?Direction.ASC: Direction.DESC, properties);
		//get number of sliced pages
		int count = (int)repo.count()/pageSize;
		if(count%2!=0) {count++;}
		for(int i=0; i<count; i++) {
			PageRequest pr = PageRequest.of(i, pageSize, sort);
			Page<Furniture> page = repo.findAll(pr);
			page.getContent().forEach(System.out::println);
			System.out.println("*********");
		}
	}
	
	@Override
	public Iterable<Furniture> saveFurnitures(Iterable<Furniture> furnitures) {
		return repo.saveAll(furnitures);
	}
	
	@Override
	public Furniture getRefById(int id) {
		return repo.getReferenceById(id);
	}
	
	@Override
	public String removeByIds(List<Integer> ids) {
		if(repo.findAllById(ids).size() == ids.size()) {
			repo.deleteAllByIdInBatch(ids);
			return "Record deleted successfully.";
		}else {
			for(int id : ids) {
				if(repo.findById(id).isEmpty()) {
					return "Record with id : "+ id + " not found, transaction rolled back.";
				}
			}
		}
		return "";
	}
}
