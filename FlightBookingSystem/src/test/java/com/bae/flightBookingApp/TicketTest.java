package com.bae.flightBookingApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.flightBookingApp.persistence.domain.Flight;
import com.bae.flightBookingApp.persistence.domain.Passenger;
import com.bae.flightBookingApp.persistence.domain.Seat;
import com.bae.flightBookingApp.persistence.domain.Ticket;

public class TicketTest {

	private Ticket testTicket;
	private Flight testFlight;
	private Seat testSeat;
	private Passenger testPassenger;
	
	@Before
	public void setUp(){
		testTicket = new Ticket();
	}
	@Test
	public void testPassenger() {
		testPassenger = new Passenger("midoria");
		testTicket.setPassenger(testPassenger);
		assertEquals("midoria", testTicket.getPassenger().getName());
	}
	@Test
	public void testFlight() {
		testFlight = new Flight("london", "manchester", 1020202, null);
		testTicket.setFlight(testFlight);
		assertEquals("manchester", testTicket.getFlight().getArrivalCity());
		assertEquals("london", testTicket.getFlight().getDepartureCity());
		assertEquals(1020202, testTicket.getFlight().getFlightNumber());
		assertEquals(testFlight, testTicket.getFlight());
	}
	@Test
	public void testSeat() {
		testSeat = new Seat("32a");
		testTicket.setSeat(testSeat);
		assertEquals("32a", testTicket.getSeat().getSeatNumber());
	
	}

}
