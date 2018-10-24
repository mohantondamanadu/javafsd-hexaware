package com.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.model.Login;
import com.login.model.Registration;
import com.login.repository.LoginRepository;
import com.login.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;	
	@Override
	public Login performLogin(Login login) {
		Login loginDetails = null;
		try {
			Registration registration = loginRepository.findUser(login.getEmailId());
			if(registration != null) {
				loginDetails = new Login();
				loginDetails.setEmailId(registration.getEmailId());
				loginDetails.setMobileNo(registration.getMobileNo());
				loginDetails.setUserType(registration.getUserType());
				loginDetails.setPassword(registration.getPassword());
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return loginDetails;
	}

}
