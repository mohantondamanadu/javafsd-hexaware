package com.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.register.model.Registration;
import com.register.repository.RegistrationReposotory;
import com.register.service.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	RegistrationReposotory registrationReposotory;
	
	@Override
	public Registration performRegister(Registration registration) {
		
		return registrationReposotory.save(registration);
	}

}
