package com.tttravel.TravelApp.dto;

import java.time.LocalDateTime;

public class BookingDTO {
	private Long id;
	private UserDTO user;
	private TourDTO tour;
	private int quantity;
	private double totalPrice;
	private String status; 
	private LocalDateTime bookingDate;
	public BookingDTO(Long id, UserDTO user, TourDTO tour, int quantity, double totalPrice, String status,
			LocalDateTime bookingDate) {
		super();
		this.id = id;
		this.user = user;
		this.tour = tour;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.status = status;
		this.bookingDate = bookingDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public TourDTO getTour() {
		return tour;
	}
	public void setTour(TourDTO tour) {
		this.tour = tour;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "BookingDTO [id=" + id + ", user=" + user + ", tour=" + tour + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", status=" + status + ", bookingDate=" + bookingDate + "]";
	}
}
