package com.register.proxy.response;

import com.register.model.Registration;

public class RegistrationResponse {
	
	private Registration registration;
	private boolean registrationStatus;

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public boolean isRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(boolean registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	
}
