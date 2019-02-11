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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightID;
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
	public Long getFlightID() {
		return flightID;
	}

	public void setFlightID(Long flightID) {
		this.flightID = flightID;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
