package com.telusko.datajpa02.service;

import java.util.List;
import java.util.Optional;

import com.telusko.datajpa02.model.Teacher;

public interface ITeacherService {
	//Create , Update
	void save(Teacher t);
	Iterable<Teacher> saveAll(Iterable<Teacher> teachers);
	
	//Read
	Iterable<Teacher> findAll();
	Optional<Teacher> findById(int id);
	Iterable<Teacher> findAllById(List<Integer> ids);
	
	//Delete
	String deleteById(int id);
	String deleteByEntity(Teacher t);
	String deleteByIds(List<Integer> ids);
}
