package com.foody.dto;

import java.util.Date;

import com.foody.entities.User;
import com.foody.entities.enums.UserGender;

public class UserResponse {
	
	private String username;

	private String fullName;
	
	private Date birthday;
	
	private UserGender gender;
	
	private Integer age;

	public UserResponse() {
		super();
	}

	public UserResponse(User user) {
		this.username = user.getUsername();
		this.fullName = user.getFullName();
		this.birthday = user.getBirthday();
		this.gender = user.getGender();
		this.age = user.getAge();
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public UserGender getGender() {
		return gender;
	}

	public void setGender(UserGender gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}