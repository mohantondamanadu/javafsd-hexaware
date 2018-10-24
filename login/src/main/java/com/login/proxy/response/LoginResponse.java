package com.login.proxy.response;

import com.login.model.Login;

public class LoginResponse {
	private Login login;
	private boolean loginStatus;
	private boolean passwordStatus;
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public boolean isPasswordStatus() {
		return passwordStatus;
	}
	public void setPasswordStatus(boolean passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

}
