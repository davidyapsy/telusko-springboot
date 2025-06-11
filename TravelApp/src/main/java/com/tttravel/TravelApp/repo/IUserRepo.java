package com.tttravel.TravelApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tttravel.TravelApp.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

}
