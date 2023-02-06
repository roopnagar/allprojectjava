package com.prodapt.registrationLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.registrationLogin.entities.Registration;
import com.prodapt.registrationLogin.services.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/saveuser")
	public Registration addRegistration(@RequestBody Registration newRegistration) {
		return registrationService.addRegistration(newRegistration);
	}
	
	

}
