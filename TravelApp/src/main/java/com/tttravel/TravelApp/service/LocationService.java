package com.tttravel.TravelApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tttravel.TravelApp.exceptions.ResourceNotFoundException;
import com.tttravel.TravelApp.model.Location;
import com.tttravel.TravelApp.repo.ILocationRepo;

@Service
public class LocationService implements ILocationService {
	private ILocationRepo repo;
	
	@Autowired
	public void setRepo(ILocationRepo repo) {
		this.repo = repo;
	}
	
	public String addLocation(Location location) {
		if(repo.findByNameAndCountryAndCity(location.getName(), location.getCountry(), location.getCity()).isPresent()) {
			return "Location existed, failed to create";
		}else {
			Location locCreated = repo.save(location);
			return "Location successfully created"; 
		}
	}
	
	public String updateLocation(Location location) {
		if(repo.findById(location.getId()).isPresent()) {
			Location locUpdated = repo.save(location);
			return "Location successfully updated"; 
		}else {
			throw new ResourceNotFoundException("Location not found with id = "+location.getId());
		}
	}
	
	public String deleteLocationById(long id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "Location successfully deleted"; 
		}else {
			throw new ResourceNotFoundException("Location not found with id = "+id);
		}
	}
	
	public List<Location> getAllLocation() {
		return repo.findAll();
	}
	
	public Location getLocationById(long id) {
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Location not found with id = "+id));
	}
}
