package com.telusko.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.telusko.model.Customer;

@Repository
public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
