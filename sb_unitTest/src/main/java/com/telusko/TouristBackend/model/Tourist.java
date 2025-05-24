package com.telusko.TouristBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tourist {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String packageType;
	private String city;
	private double amtPaid;
	public Tourist() {}
	public Tourist(int id, String name, int age, String packageType, String city, double amtPaid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.packageType = packageType;
		this.city = city;
		this.amtPaid = amtPaid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getAmtPaid() {
		return amtPaid;
	}
	public void setAmtPaid(double amtPaid) {
		this.amtPaid = amtPaid;
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", age=" + age + ", packageType=" + packageType + ", city="
				+ city + ", amtPaid=" + amtPaid + "]";
	}
}
