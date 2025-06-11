package com.tttravel.TravelApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tour {
	@Id
	@GeneratedValue
    private Long id;
    private String title;
    private String description;
    private double price;
    private int availableSeats;
    @ManyToOne
    private Location location;

    @ManyToOne
    private Lodging lodging;

    @ManyToOne
    private Transport transport;

	public Tour(Long id, String title, String description, double price, int availableSeats, Location location,
			Lodging lodging, Transport transport) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.availableSeats = availableSeats;
		this.location = location;
		this.lodging = lodging;
		this.transport = transport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Lodging getLodging() {
		return lodging;
	}

	public void setLodging(Lodging lodging) {
		this.lodging = lodging;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", availableSeats=" + availableSeats + ", location=" + location + ", lodging=" + lodging
				+ ", transport=" + transport + "]";
	}
}
