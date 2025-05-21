package com.telusko.TouristBackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.TouristBackend.model.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
