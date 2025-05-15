package com.example.SpringJDBC.repo;

import java.util.List;

import com.example.SpringJDBC.model.Employee;

public interface IEmployeeRepo {
	List<Employee> getEmployee();
}
