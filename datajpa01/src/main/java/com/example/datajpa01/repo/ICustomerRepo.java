package com.example.datajpa01.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.datajpa01.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
