package com.hoopers.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;

public class UserDetailsRequestModel {
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@NotNull
	private String email;
	@NotNull
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
