package com.telusko.webapp4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.telusko.webapp4.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {
	@Query("SELECT count(*) FROM User")
	int getRowCount();
}
