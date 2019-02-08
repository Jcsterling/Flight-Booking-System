package com.bae.flightBookingApp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.flightBookingApp.persistence.domain.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
