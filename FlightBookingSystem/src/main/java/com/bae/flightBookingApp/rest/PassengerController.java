package com.bae.flightBookingApp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.flightBookingApp.business.PassengerService;
import com.bae.flightBookingApp.persistence.domain.Passenger;


@RestController
public class PassengerController {


	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/Passenger/{id}")
	public Optional<Passenger> getTicket(@PathVariable("id") Long passengerId) {
		return passengerService.getAPassenger(passengerId);
	}
	
	@GetMapping("/allPassengers")
	public List<Passenger> getAllPassengers() {
		return passengerService.getAllPassengers();
	}
	
	@PostMapping("/addPassenger")
	public void addPassenger(@RequestBody Passenger passenger) {	
		passengerService.addPassenger(passenger);
	}
	

	
	@DeleteMapping("/ticketPassenger/{id}")
	public void deletePassenger(@PathVariable("id") Long passengerId) {
		passengerService.deletePassenger(passengerId);
	}
}
