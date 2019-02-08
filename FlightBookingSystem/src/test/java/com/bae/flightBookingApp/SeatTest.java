package com.bae.flightBookingApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.flightBookingApp.persistence.domain.Seat;

public class SeatTest {

	private Seat testSeat;
	
	@Before
	public void setUp() {
		testSeat = new Seat();	
	}

	@Test
	public void testSeat() {
		assertEquals("12b", testSeat.getSeatNumber());
	}
	
	@Test
	public void testSetSeat() {
		testSeat.setSeatNumber("24a");
		assertEquals("24a", testSeat.getSeatNumber());
	}

}
