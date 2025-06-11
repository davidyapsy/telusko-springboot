package com.tttravel.TravelApp.dto;

import java.util.List;

public class UserDTO {
	private Long id;
	private String name;
	private String email;
	private String password;
	private String role;
	private boolean enabled;
    private List<BookingDTO> bookings;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<BookingDTO> getBookings() {
		return bookings;
	}
	public void setBookings(List<BookingDTO> bookings) {
		this.bookings = bookings;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + ", bookings=" + bookings + "]";
	}
}
