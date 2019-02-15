package com.bae.flightBookingApp.ModuleTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.flightBookingApp.persistence.domain.Passenger;

public class PassengerTest {
	
	private Passenger testPassenger; 

	@Before
	public void setUp() {
		testPassenger = new Passenger();
	}

	@Test
	public void testPassenger() {
		assertEquals("Dash Incredible", testPassenger.getName());
	}
	
	@Test
	public void testSetPassenger() {
		testPassenger.setName("martin lawrence");
		assertEquals("martin lawrence", testPassenger.getName());
	}


}
