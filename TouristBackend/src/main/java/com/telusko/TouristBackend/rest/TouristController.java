package com.telusko.TouristBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
public class TouristController {
	private ITouristService service;
	
	@Autowired
	public void setService(ITouristService service) {
		this.service = service;
	}
	
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable("id")int id){
		try {
			Tourist tourist = service.getTouristById(id);
			return new ResponseEntity<Tourist> (tourist, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/get-all-tourist")
	public ResponseEntity<List<Tourist>> getAllTourist(){
		return new ResponseEntity<List<Tourist>> (service.getAllTourist(), HttpStatus.OK);
	}
	
	@PostMapping("/add-new-tourist")
	public ResponseEntity<String> addTourist(@RequestBody Tourist tourist){
		String msg = service.addTourist(tourist);
		return new ResponseEntity<String> (msg, HttpStatus.OK);
	}
	
	@PutMapping("/update-tourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
		try {
			String msg = service.updateTourist(tourist);
			return new ResponseEntity<String> (msg, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping("/update-tourist/{id}/{amtPaid}")
	public ResponseEntity<String> updateTouristOfAmtPaid(@PathVariable("id")int id, @PathVariable("amtPaid")double amtPaid){
		try {
			//String msg = service.updateTouristAmtPaid(id, amtPaid);
			return new ResponseEntity<String> (service.updateTouristAmtPaid(id, amtPaid), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id")int id){
		try {
			String msg = service.deleteTouristById(id);
			return new ResponseEntity<String> (msg, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String> (e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
}
