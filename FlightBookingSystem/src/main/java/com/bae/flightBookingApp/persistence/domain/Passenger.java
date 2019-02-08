package com.bae.flightBookingApp.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long passengerID;
	private String name;

	public Passenger() {
		setName("Dash Incredible");
	}
	
	public Passenger(String name) {	
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(Long passengerID) {
		this.passengerID = passengerID;
	}

}
