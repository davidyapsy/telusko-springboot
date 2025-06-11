package com.tttravel.TravelApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transport {
	@Id
	@GeneratedValue
    private Long id;
    private String type;
    private String provider;
    private int capacity;
	public Transport(Long id, String type, String provider, int capacity) {
		super();
		this.id = id;
		this.type = type;
		this.provider = provider;
		this.capacity = capacity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Transport [id=" + id + ", type=" + type + ", provider=" + provider + ", capacity=" + capacity + "]";
	}
}
