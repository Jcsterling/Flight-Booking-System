package com.bae.flightBookingApp.persistence.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ticketID;
	@ManyToOne
	private Passenger passenger;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Flight flight;
	@OneToOne
	private Seat seat;
	
	private Date creationDate;

	public Ticket() {
	}
	
	public Ticket (Long ticketID, Passenger passenger, Flight flight, Seat seat, Date creationDate) {
		setTicketID(ticketID);
		setPassenger(passenger);
		setFlight(flight);
		setSeat(seat);
		setCreationDate(creationDate);
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Long getTicketID() {
		return ticketID;
	}

	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
