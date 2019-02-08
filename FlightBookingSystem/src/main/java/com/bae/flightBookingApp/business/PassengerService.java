package com.bae.flightBookingApp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.flightBookingApp.persistence.domain.Passenger;
import com.bae.flightBookingApp.persistence.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	
	public List<Passenger> getAllPassengers(){
        return passengerRepo.findAll();
    }
	
	public String addPassenger(Passenger passenger) {
		passengerRepo.save(passenger);
	
		return "ticket added";
	}

	
	 public String deletePassenger(Long PassengerId){
	        Optional<Passenger> Passenger = passengerRepo.findById(PassengerId); 
	        if (Passenger == null)
	        	return "Nothing to delete";
	        passengerRepo.deleteById(PassengerId);
	        return "ticket deleted";
	 } 
	 
	 public Optional<Passenger> getAPassenger(Long id) {
	        return passengerRepo.findById(id);
	    }



}
