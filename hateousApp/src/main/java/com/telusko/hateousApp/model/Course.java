package com.telusko.hateousApp.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel {
	private int id;
	private String name;
	private int year;
	public Course(int id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", year=" + year + "]";
	}
}
