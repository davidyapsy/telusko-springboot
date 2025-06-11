package com.tttravel.TravelApp.dto;

public class TourDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private int availableSeats;
    private LocationDTO location;
    private LodgingDTO lodging;
    private TransportDTO transport;

	public TourDTO(Long id, String title, String description, double price, int availableSeats, LocationDTO location,
			LodgingDTO lodging, TransportDTO transport) {
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

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}

	public LodgingDTO getLodging() {
		return lodging;
	}

	public void setLodging(LodgingDTO lodging) {
		this.lodging = lodging;
	}

	public TransportDTO getTransport() {
		return transport;
	}

	public void setTransport(TransportDTO transport) {
		this.transport = transport;
	}

	@Override
	public String toString() {
		return "TourDTO [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", availableSeats=" + availableSeats + ", location=" + location + ", lodging=" + lodging
				+ ", transport=" + transport + "]";
	}
}
