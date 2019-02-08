package com.bae.flightBookingApp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.flightBookingApp.persistence.domain.Seat;
import com.bae.flightBookingApp.persistence.repository.SeatRepository;

@Service
public class SeatService {
	
	@Autowired
	private SeatRepository seatRepo;
	
	
	public List<Seat> getAllSeats(){
        return seatRepo.findAll();
    }
	
	public String addSeat(Seat seat) {
		seatRepo.save(seat);
	
		return "ticket added";
	}

	
	 public String deleteSeat(Long SeatId){
	        Optional<Seat> Seat = seatRepo.findById(SeatId); 
	        if (Seat == null)
	        	return "Nothing to delete";
	        seatRepo.deleteById(SeatId);
	        return "seat deleted";
	 } 
	 
	 public Optional<Seat> getASeat(Long id) {
	        return seatRepo.findById(id);
	    }




}
