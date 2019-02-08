package com.bae.flightBookingApp.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seatID;
	private String seatNumber;

	public Seat() {
		setSeatNumber("12b");
	}
	
	public Seat(String seatNumber) {
		setSeatNumber(seatNumber);
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Long getSeatID() {
		return seatID;
	}

	public void setSeatID(Long seatID) {
		this.seatID = seatID;
	}

}
