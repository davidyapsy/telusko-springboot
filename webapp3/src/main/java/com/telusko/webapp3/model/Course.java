package com.telusko.webapp3.model;

public class Course {
	private int id;
	private String name;
	private int yearCreated;
	public Course() {}
	public Course(int id, String name, int yearCreated) {
		super();
		this.id = id;
		this.name = name;
		this.yearCreated = yearCreated;
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
	public int getYearCreated() {
		return yearCreated;
	}
	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", yearCreated=" + yearCreated + "]";
	}
}
