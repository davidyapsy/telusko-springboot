package com.telusko.restapp1.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.restapp1.model.Student;

@Controller
public class Controller1 {
	
	@GetMapping("/add")
	//@ResponseBody
	public String viewAdd() {
		return "add";
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Student stud) {
		System.out.println(stud);
		return "add";
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<Student> showWelcome() {
		Student stud = new Student(1, "david", "c1ity");
		return new ResponseEntity<Student>(stud, HttpStatus.OK);
	}
}
