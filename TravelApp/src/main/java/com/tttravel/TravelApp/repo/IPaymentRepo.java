package com.tttravel.TravelApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tttravel.TravelApp.model.Payment;

@Repository
public interface IPaymentRepo extends JpaRepository<Payment, Long> {

}
