package com.telusko.TouristBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.TouristBackend.model.Tourist;
import com.telusko.TouristBackend.service.ITouristService;
import com.telusko.TouristBackend.service.TeluskoService;

@RestController
public class TouristController {
	private ITouristService service;
	
	@Autowired
	public void setService(ITouristService service) {
		this.service = service;
	}
	
	@GetMapping("/get-all-tourist")
	public ResponseEntity<List<Tourist>> getAllTourist(){
		return new ResponseEntity<List<Tourist>> (service.getAllTourist(), HttpStatus.OK);
	}
	
	@PostMapping("/add-new-tourist")
	public ResponseEntity<String> addTourist(@RequestBody Tourist tourist){
		String msg = service.addTourist(tourist);
		return new ResponseEntity<String> (msg, HttpStatus.CREATED);
	}
	
}
