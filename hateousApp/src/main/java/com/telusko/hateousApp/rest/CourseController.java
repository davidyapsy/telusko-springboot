package com.telusko.hateousApp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.hateousApp.model.Course;

@RestController
public class CourseController {
	
	@GetMapping("/get-course-info")
	public ResponseEntity<Course> getCourse(){
		Course course = new Course(1, "course1", 2020);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class)
				.getAllCourses()).withRel("To get all courses");
		Link link2 = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class)
				.getGreeting()).withRel("To get greeting");
		course.add(link);
		course.add(link2);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@GetMapping("/get-all-courses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> courseList = new ArrayList<>();
		Course course1 = new Course(1, "course1", 2020);
		Course course2 = new Course(2, "course2", 2021);
		Course course3 = new Course(3, "course3", 2022);
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		return new ResponseEntity<List<Course>>(courseList, HttpStatus.OK);
	}
	
	@GetMapping("/get-greeting")
	public ResponseEntity<String> getGreeting(){
		return new ResponseEntity<String>("Welcome to Greeting", HttpStatus.OK);
	}
}
