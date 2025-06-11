package com.tttravel.TravelApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tttravel.TravelApp.model.Tour;

@Repository
public interface ITourRepo extends JpaRepository<Tour, Long> {

}
