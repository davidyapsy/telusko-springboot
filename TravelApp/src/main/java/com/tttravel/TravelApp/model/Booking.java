package com.tttravel.TravelApp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private User user;

	@ManyToOne
	private Tour tour;

	private int quantity;
	private double totalPrice;
	private String status; 
	private LocalDateTime bookingDate;
	public Booking(Long id, User user, Tour tour, int quantity, double totalPrice, String status,
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
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
		return "Booking [id=" + id + ", user=" + user + ", tour=" + tour + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", status=" + status + ", bookingDate=" + bookingDate + "]";
	}
}
