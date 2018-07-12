package com.chaouki.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	
	//just to test the controller
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "createLocation"; 
		
	}

}
