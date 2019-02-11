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


import com.bae.flightBookingApp.business.TicketService;
import com.bae.flightBookingApp.persistence.domain.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/ticket/{id}")
	public Optional<Ticket> getTicket(@PathVariable("id") Long ticketID) {
		return ticketService.getATicket(ticketID);
	}
	
	@GetMapping("/allTickets")
	public List<Ticket> getAllTickets() {
		return ticketService.getAllTickets();
	}
	
	@PostMapping("/addTicket")
	public void addTicket(@RequestBody Ticket ticket) {	
		if (ticket.getCreationDate() == null) 	
			ticket.setCreationDate(new Date());
		ticketService.addTicket(ticket);
	}
	
//	@PutMapping("/updateFlight/{id}")
//	public void updateFlight(@PathVariable("id") Long flightId, @Valid @RequestBody Flight flight) {
//		if (flight.getCreationDate() == null) 	
//			flight.setCreationDate(new Date());
//		 flightService.updateFlight(flightId, flight);
//	}
	
	@DeleteMapping("/ticketFlight/{id}")
	public void deleteTicket(@PathVariable("id") Long ticketID) {
		ticketService.deleteTicket(ticketID);
	}
}
