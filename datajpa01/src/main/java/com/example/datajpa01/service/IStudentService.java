package com.example.datajpa01.service;

import com.example.datajpa01.model.Student;

public interface IStudentService {
	void saveStudent(Student s);
	Iterable<Student> saveStudents(Iterable<Student> s);
}
