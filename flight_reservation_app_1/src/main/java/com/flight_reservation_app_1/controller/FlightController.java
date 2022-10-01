package com.flight_reservation_app_1.controller;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.Repository.FlightRepository;
import com.flight_reservation_app_1.entity.Flight;

@Controller
public class FlightController {
	@Autowired FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,
			@RequestParam("to") String to
			,@RequestParam("departureDate")@DateTimeFormat (pattern = "MM-dd--yyyy") Date departureDate,
			ModelMap model) {
		List<Flight> findFlights = flightRepo.findFlights(from,to,departureDate);
		System.out.println(findFlights);
		model.addAttribute("findFlights", findFlights);
		return"diplayFlights";
	}
}




