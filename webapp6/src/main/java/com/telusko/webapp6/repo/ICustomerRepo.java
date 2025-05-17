package com.telusko.webapp6.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.webapp6.model.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {
}
