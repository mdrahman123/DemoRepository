package com.flight_reservation_app_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.Repository.UserRepository;
import com.flight_reservation_app_1.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@RequestMapping("/showReg")
	public String showReg() {
		return "showRegjsp";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute  User user,ModelMap model) {
		userRepo.save(user);
		
		return"loginjsp";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		
		
		return"loginjsp";
	}
	@RequestMapping("/createNewAccount")
	public String createNewAccount() {
		return "showRegjsp";
	}
	@RequestMapping("/verifylogin")
	public String verifyLogin(@RequestParam("emailId") String emailId,
			@RequestParam("password") String password,
			ModelMap model) {
		User user=userRepo.findByEmail(emailId);
		
		if(user!=null) {
				if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
				return"findFlightsjsp";
				}
		else {
			model.addAttribute("error","invalid username or password");
			return "loginjsp";
		}
		}
				else{
			model.addAttribute("error","invalid username or password");
			return "loginjsp";
		}
}
}

