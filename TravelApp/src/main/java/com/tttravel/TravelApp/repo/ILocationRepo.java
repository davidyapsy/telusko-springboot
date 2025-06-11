package com.tttravel.TravelApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tttravel.TravelApp.model.Location;

@Repository
public interface ILocationRepo extends JpaRepository<Location, Long> {
	Optional<Location> findByNameAndCountryAndCity(String name, String country, String city);
}
