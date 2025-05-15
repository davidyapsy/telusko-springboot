package com.telusko.dto;

public class CustomerDto {
	private String id;
	private int custNum;
	private String name;
	private String city;
	private int age;
	public CustomerDto() {}
	public CustomerDto(String id, int custNum, String name, String city, int age) {
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
		return "CustomerDto [id=" + id + ", custNum=" + custNum + ", name=" + name + ", city=" + city + ", age=" + age
				+ "]";
	}
	
}
