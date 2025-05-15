package com.example.SpringJDBC.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringJDBC.model.Employee;

@Repository
public class EmployeeRepo implements IEmployeeRepo{
	@Autowired
	public DataSource ds;
	
	private List<Employee> empList;

	@Override
	public List<Employee> getEmployee() {
		try {
			empList = new ArrayList<>();
			Connection conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				empList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return empList;
	}
	
}
