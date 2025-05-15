package com.example.datajpa03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Furniture {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int manuYear;
	public Furniture() {}
	public Furniture(String name, int manuYear) {
		super();
		this.name = name;
		this.manuYear = manuYear;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManuYear() {
		return manuYear;
	}
	public void setManuYear(int manuYear) {
		this.manuYear = manuYear;
	}
	@Override
	public String toString() {
		return "Furniture [id=" + id + ", name=" + name + ", manuYear=" + manuYear + "]";
	}
	
}
