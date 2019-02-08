package com.bae.flightBookingApp.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.flightBookingApp.business.SeatService;
import com.bae.flightBookingApp.business.TicketService;
import com.bae.flightBookingApp.persistence.domain.Seat;
import com.bae.flightBookingApp.persistence.domain.Ticket;

@RestController
public class SeatController {

	@Autowired
	private SeatService seatService;
	
	@GetMapping("/seat/{id}")
	public Optional<Seat> getSeat(@PathVariable("id") Long seatId) {
		return seatService.getASeat(seatId);
	}
	
	@GetMapping("/allSeats")
	public List<Seat> getAllSeats() {
		return seatService.getAllSeats();
	}
	
	@PostMapping("/addSeat")
	public void addSeat(@RequestBody Seat seat) {	
		
		seatService.addSeat(seat);
	}
	
	@DeleteMapping("/deleatSeat/{id}")
	public void deleteSeat(@PathVariable("id") Long seatId) {
		seatService.deleteSeat(seatId);
	}
}
