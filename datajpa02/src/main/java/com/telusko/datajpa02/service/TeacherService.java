package com.telusko.datajpa02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.telusko.datajpa02.model.Teacher;
import com.telusko.datajpa02.repo.ITeacherRepo;

public class TeacherService implements ITeacherService{
	@Autowired
	private ITeacherRepo repo;

	@Override
	public void save(Teacher t) {
		repo.save(t);
	}

	@Override
	public Iterable<Teacher> saveAll(Iterable<Teacher> teachers) {
		return repo.saveAll(teachers);
	}

	@Override
	public Iterable<Teacher> findAll() {
		return repo.findAll();
	}
	
	@Override
	public Optional<Teacher> findById(int id){
		return repo.findById(id);
	}

	@Override
	public Iterable<Teacher> findAllById(List<Integer> ids) {
		return repo.findAllById(ids);
	}
	
	@Override
	public String deleteById(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "Record deleted successfully";
		}else {
			return "Id not found, Record has not been deleted";
		}
	}
	
	@Override
	public String deleteByEntity(Teacher t) {
		if(repo.findById(t.getId()).isPresent()) {
			repo.delete(t);
			return "Record deleted successfully";
		}else {
			return "Id not found, Record has not been deleted";
		}
	}
	
	@Override
	public String deleteByIds(List<Integer> ids) {
		for(int id : ids) {
			if(repo.findById(id).isEmpty()) {
				return "Id: "+ id+" not found, failed to delete records";
			}
		}
		repo.deleteAllById(ids);
		return "Records successfully deleted";
	}
}
