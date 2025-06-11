package com.tttravel.TravelApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tttravel.TravelApp.model.Booking;

@Repository
public interface IBookingRepo extends JpaRepository<Booking, Long> {

}
