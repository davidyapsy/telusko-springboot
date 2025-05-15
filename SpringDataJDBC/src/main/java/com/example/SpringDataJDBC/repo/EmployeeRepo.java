package com.example.SpringDataJDBC.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJDBC.model.Employee;

@Repository
public class EmployeeRepo implements IEmployeeRepo{
	@Autowired
	public JdbcTemplate jt;

	@Override
	public void insertEmployee(Employee emp) {
		PreparedStatementSetter ps = pstmt -> {
			pstmt.setInt(1, 4);
			pstmt.setString(2, "David4");
			pstmt.setString(3, "city4");
		};
		
		int rows = jt.update("INSERT INTO Employee VALUES(?, ?, ?)", ps);
		System.out.println("Rows affected: "+rows);
	}
	

	
}
