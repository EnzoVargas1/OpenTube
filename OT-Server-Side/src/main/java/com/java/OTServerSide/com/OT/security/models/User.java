package com.java.OTServerSide.com.OT.security.models;
import java.io.File;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.java.OTServerSide.com.OT.models.Channel;
import com.java.OTServerSide.com.OT.models.Profile;
import com.java.OTServerSide.com.OT.models.Subscriber;
import com.java.OTServerSide.com.OT.models.Video;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private Date birthDate;
	
	private Profile profile;
	private Channel channel;
	private Subscriber subscribers;
	
	public User() {}
	
	public User(String username, String password, String email, 
    String phoneNumber) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthDate = new Date();
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
