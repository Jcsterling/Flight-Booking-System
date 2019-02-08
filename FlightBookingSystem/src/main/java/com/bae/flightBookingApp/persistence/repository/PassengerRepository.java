package com.bae.flightBookingApp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.flightBookingApp.persistence.domain.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
