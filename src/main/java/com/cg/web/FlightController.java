package com.cg.web;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entity.Flight;
import com.cg.exception.InvalidFlightException;
import com.cg.service.FlightService;


@Controller
public class FlightController {


	@Autowired
	private FlightService service;
	
	

	@RequestMapping(value= "/find.do")
	public String findFlight(int id, Map model) throws InvalidFlightException {
	
		Flight flight= service.getFlight(id);
		model.put("flight", flight);
		return "find";
		
	}
	
	
	@RequestMapping("/add.do")
	public String getFlight(Flight flight, Map model) {
		int id= service.addFlight(flight);
		model.put("message", "flight added: "+ id);
		return "add";
	}
	
	

}