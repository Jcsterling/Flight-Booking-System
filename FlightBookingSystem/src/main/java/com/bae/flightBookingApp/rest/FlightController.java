package com.bae.flightBookingApp.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.flightBookingApp.business.FlightService;
import com.bae.flightBookingApp.persistence.domain.Flight;

@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	
	@GetMapping("/flight/{id}")
	public Optional<Flight> getFlight(@PathVariable("id") Long flightId) {
		return flightService.getAFlight(flightId);
	}
	
	@GetMapping("/allFlights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
	
	@PostMapping("/addFlight")
	public void addFlight(@RequestBody Flight flight) {	
		if (flight.getCreationDate() == null) 	
			flight.setCreationDate(new Date());
		flightService.addFlight(flight);
	}
	
	@PutMapping("/updateFlight/{id}")
	public void updateFlight(@PathVariable("id") Long flightId, @Valid @RequestBody Flight flight) {
		if (flight.getCreationDate() == null) 	
			flight.setCreationDate(new Date());
		 flightService.updateFlight(flightId, flight);
	}
	
	@DeleteMapping("/deleteFlight/{id}")
	public void deleteFlight(@PathVariable("id") Long flightId) {
		flightService.deleteFlight(flightId);
	}
	
	 
//	public void addDateTimeFormatPatterns(Model uiModel) {
//        uiModel.addAttribute("xXX_mydate_date_format", "yyyy-MM-dd HH:mm:ss");
//    }
	
	
}
