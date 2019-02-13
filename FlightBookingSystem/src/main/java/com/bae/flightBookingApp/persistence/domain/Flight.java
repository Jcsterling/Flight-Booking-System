package com.bae.flightBookingApp.persistence.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;
	
	@Temporal(TemporalType.TIME)
	@LastModifiedDate
	private Date creationDate;
	
//	@OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "flight")
//	private List<Ticket> ticket;

	public Flight() {
		departureCity = "departure city";
		arrivalCity = "arrival city";
		flightNumber = 1100;
	}
	
	public Flight(String departureCity, String arrivalCity, int flightNumber, Date creationDate) {
		setDepartureCity(departureCity);
		setArrivalCity(arrivalCity);
		setFlightNumber(flightNumber);
		setCreationDate(creationDate);
		
	}

//	public List<Ticket> getTicket() {
//		return ticket;
//	}
//
//	public void setTicket(List<Ticket> ticket) {
//		this.ticket = ticket;
//	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
