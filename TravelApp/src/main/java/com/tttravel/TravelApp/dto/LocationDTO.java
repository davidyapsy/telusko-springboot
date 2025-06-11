package com.tttravel.TravelApp.dto;


public class LocationDTO {
    private Long id;
    private String name;
    private String description;
    private String country;
    private String city;
	public LocationDTO(Long id, String name, String description, String country, String city) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.country = country;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "LocationDTO [id=" + id + ", name=" + name + ", description=" + description + ", country=" + country
				+ ", city=" + city + "]";
	}
}
