package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.model.Login;
import com.login.proxy.request.LoginRequest;
import com.login.proxy.response.LoginResponse;
import com.login.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@PostMapping(value="/login", produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LoginResponse performLogin(@RequestBody LoginRequest loginRequest) {
		LoginResponse loginResponse = new LoginResponse();
		Login loginDetails =  null;
		boolean loginStatus =  true;
		boolean checkPassword = false;
		try {
			 loginDetails = loginService.performLogin(loginRequest.getLogin());
			if(loginDetails == null) {
				loginStatus = false;
			}else {
				if(loginRequest.getLogin().getPassword().equals(loginDetails.getPassword())) {
					checkPassword = true;
				}
			}
		}catch(Exception e) {
			
		}
		loginResponse.setLogin(loginDetails);
		loginResponse.setLoginStatus(loginStatus);
		loginResponse.setPasswordStatus(checkPassword);
		return loginResponse;
	}

}
