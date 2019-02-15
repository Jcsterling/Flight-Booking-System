package com.bae.flightBookingApp.ModuleTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import com.bae.flightBookingApp.persistence.domain.Flight;
import com.bae.flightBookingApp.util.JSONUtil;


public class FlightTest {
	
	private JSONUtil jsonutil;
	private Flight testFlight;
	
	@Before
	public void setup() {

		jsonutil = new JSONUtil();
		testFlight = new Flight();
	}
	
	@Test
	public void testFlight() {
		assertEquals("departure city", testFlight.getDepartureCity());
		assertEquals("arrival city", testFlight.getArrivalCity());
		assertEquals(1100, testFlight.getFlightNumber());
	}
	
	@Test
	public void testSetDepartureCity() {	
		testFlight.setDepartureCity("Torronto");
		assertEquals("Torronto", testFlight.getDepartureCity());
	}
	
	@Test
	public void testSetArrivalCity() {
		testFlight.setArrivalCity("London");
		assertEquals("London", testFlight.getArrivalCity());
	}
	
	@Test
	public void testSetFlightNumber() {	
		testFlight.setFlightNumber(110001);
		assertEquals(110001, testFlight.getFlightNumber());
	}

}

