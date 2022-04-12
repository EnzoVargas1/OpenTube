package com.java.OTServerSide.com.OT.models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RootComment extends Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public RootComment() {}
	
	public RootComment(String text) {
		super(text);
		setDate(new Date());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
