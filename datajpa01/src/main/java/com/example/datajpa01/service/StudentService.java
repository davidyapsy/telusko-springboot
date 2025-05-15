package com.example.datajpa01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.datajpa01.model.Student;
import com.example.datajpa01.repo.IStudentRepo;

@Repository
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudentRepo repo;
	@Override
	public void saveStudent(Student s) {
		Student stud = repo.save(s);
		System.out.println(stud.getName());
	}
	@Override
	public Iterable<Student> saveStudents(Iterable<Student> s) {
		return repo.saveAll(s);
	}
	
}
