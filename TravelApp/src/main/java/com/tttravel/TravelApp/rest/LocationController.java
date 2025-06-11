package com.tttravel.TravelApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tttravel.TravelApp.model.Location;
import com.tttravel.TravelApp.service.ILocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	private ILocationService service;
	
	@Autowired
	public void setService(ILocationService service) {
		this.service = service;
	}
	
	@GetMapping("/get-all-location")
	public ResponseEntity<List<Location>>getAllLocation(){
		return new ResponseEntity<List<Location>> (service.getAllLocation(), HttpStatus.OK);
	}
	
	@GetMapping("/get-location-by-id/{id}")
	public ResponseEntity<Location>getLocationById(@PathVariable("id") int id){
		return new ResponseEntity<Location> (service.getLocationById(id), HttpStatus.OK);
	}
	
	@PostMapping("/add-location")
	public ResponseEntity<String>addLocation(@RequestBody Location location){
		return new ResponseEntity<String> (service.addLocation(location), HttpStatus.CREATED);
	}
	
	@PutMapping("/update-location")
	public ResponseEntity<String>updateLocation(@RequestBody Location location){
		return new ResponseEntity<String> (service.updateLocation(location), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-location-by-id/{id}")
	public ResponseEntity<String>deleteLocationById(@PathVariable("id") int id){
		return new ResponseEntity<String> (service.deleteLocationById(id), HttpStatus.OK);
	}
	
}
