package com.bae.flightBookingApp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bae.flightBookingApp.persistence.domain.Ticket;
import com.bae.flightBookingApp.persistence.repository.TicketRepository;

@Service
public class TicketService  {
	
	@Autowired
	private TicketRepository ticketRepo;
	
	
	public List<Ticket> getAllTickets(){
        return ticketRepo.findAll();
    }
	
	public String addTicket(Ticket ticket) {
		ticketRepo.save(ticket);
	
		return "ticket added";
	}
	
//	public String updateFlight(Long flightId, Flight flight) {
//		Flight newFlight = flightRepo.findById(flightId).orElseThrow(() -> new ResourceNotFoundException("Flight", "flightID", flightId));
//		if (newFlight != null) {
//			flightRepo.deleteById(flightId);
//			newFlight.setArrivalCity(flight.getArrivalCity());
//			newFlight.setDepartureCity(flight.getDepartureCity());
//			newFlight.setFlightNumber(flight.getFlightNumber());
//			newFlight.setFlightID(flight.getFlightID());
//			flightRepo.save(flight);
//		}	
//		return "Flight updated";
//	}
	
	 public String deleteTicket(Long TicketId){
	        Optional<Ticket> ticket = ticketRepo.findById(TicketId); 
	        if (ticket == null)
	        	return "Nothing to delete";
	        	ticketRepo.deleteById(TicketId);
	        return "ticket deleted";
	 } 
	 
	 public Optional<Ticket> getATicket(Long id) {
	        return ticketRepo.findById(id);
	    }


}
