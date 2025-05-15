package com.telusko.mpapp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.mpapp.model.Student;

@RestController
public class Controller1 {
	
	@GetMapping("/stud-info")
	public ResponseEntity<List<Student>> viewAdd() {
		List<Student> studList = new ArrayList<>();
		Student stud1 = new Student(1, "david1", "KL1");
		Student stud2 = new Student(2, "david2", "KL2");
		Student stud3 = new Student(3, "david3", "KL3");
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		return new ResponseEntity<List<Student>>(studList, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Student stud) {
		int id = stud.getId();
		String response = "Student with id="+id+ " has been added successfully";
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcome";
	}
}
