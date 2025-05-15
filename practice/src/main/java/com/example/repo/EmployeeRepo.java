package com.example.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeRepo implements IEmployee {
	@Autowired
	private DataSource ds;
	
	@Autowired
	private JdbcTemplate jt;
	
	List<Employee> emp;
	
	@Override
	public void getEmployee(int id) {
		getUsingJdbc(id);
	}
	
	private void getUsingJdbc(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement("SELECT * FROM Employee WHERE id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


}
