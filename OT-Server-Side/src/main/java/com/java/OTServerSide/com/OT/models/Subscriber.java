package com.java.OTServerSide.com.OT.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.java.OTServerSide.com.OT.security.models.User;

public class Subscriber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private User user;
	private List<Channel> channels = new ArrayList<Channel>(); 
	
	public Subscriber() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	
	
}
