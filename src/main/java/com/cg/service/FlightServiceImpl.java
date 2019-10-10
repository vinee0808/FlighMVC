package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Flight;
import com.cg.exception.InvalidFlightException;
import com.cg.repo.FlightRepo;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	
	
	
	@Autowired 
	private FlightRepo repo;
	
	//  @Transactional(propagation = Propagation.REQUIRED)

	public int addFlight(Flight flight) {
		return repo.save(flight);
	}

	public Flight getFlight(int id) throws InvalidFlightException {
		Flight f= repo.fetch(id);
		if(f==null)
			throw new InvalidFlightException("Flight not found "+id);
		return f;
		
		//return repo.fetch(id);
	}

	public List<Flight> getList() {
	return repo.list();
	}

	public List<Flight> getCareer(String carrier) throws InvalidFlightException {
		//return repo.findByCarrier(carrier);
		List<Flight> f= repo.findByCarrier(carrier);
		if(f==null || f.size()==0)
			throw new InvalidFlightException("Flight not found "+carrier);
		return f;
	}	

}
