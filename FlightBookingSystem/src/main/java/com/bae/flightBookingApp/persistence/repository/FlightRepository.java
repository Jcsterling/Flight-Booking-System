package com.bae.flightBookingApp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.flightBookingApp.persistence.domain.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {


}
