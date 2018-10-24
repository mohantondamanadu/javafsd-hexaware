package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.register.model.Registration;
import com.register.proxy.request.RegistrationRequest;
import com.register.proxy.response.RegistrationResponse;
import com.register.service.RegistrationService;
@CrossOrigin
@RestController
public class RegisterController {
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping(value="/register", produces=MediaType.APPLICATION_JSON_VALUE)
	public RegistrationResponse performRegistration(@RequestBody RegistrationRequest registrationRequest) {
		RegistrationResponse registrationResponse = new RegistrationResponse();
		boolean registrationStatus = true;
		Registration registration = null; 
		try {
			registration = registrationService.performRegister(registrationRequest.getRegistration());
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(registration == null) {
			registrationStatus = false;			
		}
		registrationResponse.setRegistration(registration);
		registrationResponse.setRegistrationStatus(registrationStatus);
		
		return registrationResponse;
	}

}
