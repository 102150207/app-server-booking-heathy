package com.foody.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequest {
	
	@NotBlank(message = "Fist name is not empty")
	@Size(min = 1, max = 30)
	private String fistName;
	
	@NotBlank(message = "Last name is not empty")
	@Size(min = 1, max = 30)
	private String lastName;
	
	@NotBlank(message = "Username is not empty")
	@Size(min = 6, max = 15)
	private String username;
	
	@NotBlank(message = "Email is not empty")
	@Email(message = "The email is not properly formatted")
	@Size(max = 40)
	private String email;
	
	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
