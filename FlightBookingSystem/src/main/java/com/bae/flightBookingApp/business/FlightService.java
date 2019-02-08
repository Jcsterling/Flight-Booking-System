package com.bae.flightBookingApp.business;




import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bae.flightBookingApp.exceptions.ResourceNotFoundException;
import com.bae.flightBookingApp.persistence.domain.Flight;
import com.bae.flightBookingApp.persistence.repository.FlightRepository;

@Service
public class FlightService {
	
	

	@Autowired
	private FlightRepository flightRepo;
	
	public List<Flight> getAllFlights(){
        return flightRepo.findAll();
    }
	
	public String addFlight(Flight flight) {
		flightRepo.save(flight);
	
		return "Flight added";
	}
	
	public String updateFlight(Long flightId, Flight flight) {
		Flight newFlight = flightRepo.findById(flightId).orElseThrow(() -> new ResourceNotFoundException("Flight", "flightID", flightId));
		if (newFlight != null) {
			flightRepo.deleteById(flightId);
			newFlight.setArrivalCity(flight.getArrivalCity());
			newFlight.setDepartureCity(flight.getDepartureCity());
			newFlight.setFlightNumber(flight.getFlightNumber());
			newFlight.setFlightID(flight.getFlightID());
			flightRepo.save(flight);
		}	
		return "Flight updated";
	}
	
	 public String deleteFlight(Long flightId){
	        Optional<Flight> flight = flightRepo.findById(flightId); 
	        if (flight == null)
	        	return "Nothing to delete";
	        flightRepo.deleteById(flightId);
	        return "Flight deleted";
	 } 
	 
	 public Optional<Flight> getAFlight(Long id) {
	        return flightRepo.findById(id);
	    }

	 public String getAFlightByDeparture(Long id, String departure) {      
		 return flightRepo.findById(id).get().getDepartureCity();
	    }
	  
	 
	 
	
	 
}
