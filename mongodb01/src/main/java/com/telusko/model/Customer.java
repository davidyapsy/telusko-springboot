package com.telusko.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	private String id;
	private int custNum;
	private String name;
	private String city;
	private int age;
	public Customer() {}
	public Customer(String id, int custNum, String name, String city, int age) {
		super();
		this.id = id;
		this.custNum = custNum;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custNum=" + custNum + ", name=" + name + ", city=" + city + ", age=" + age
				+ "]";
	}
	
}
