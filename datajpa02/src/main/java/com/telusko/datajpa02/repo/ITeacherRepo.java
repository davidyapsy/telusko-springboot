package com.telusko.datajpa02.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.datajpa02.model.Teacher;

public interface ITeacherRepo extends CrudRepository<Teacher, Integer> {

}
