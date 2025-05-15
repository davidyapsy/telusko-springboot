package com.example.datajpa01.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.datajpa01.model.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
