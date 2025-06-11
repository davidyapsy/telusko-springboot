package com.tttravel.TravelApp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
    @Id 
    @GeneratedValue
    private Long id;

    @OneToOne
    private Booking booking;

    private String stripePaymentId;
    private double amount;
    private String status; 
    private LocalDateTime paymentDate;
	public Payment(Long id, Booking booking, String stripePaymentId, double amount, String status,
			LocalDateTime paymentDate) {
		super();
		this.id = id;
		this.booking = booking;
		this.stripePaymentId = stripePaymentId;
		this.amount = amount;
		this.status = status;
		this.paymentDate = paymentDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public String getStripePaymentId() {
		return stripePaymentId;
	}
	public void setStripePaymentId(String stripePaymentId) {
		this.stripePaymentId = stripePaymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", booking=" + booking + ", stripePaymentId=" + stripePaymentId + ", amount="
				+ amount + ", status=" + status + ", paymentDate=" + paymentDate + "]";
	}
}
