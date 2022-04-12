package com.java.OTServerSide.com.OT.models;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SubComment extends Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public SubComment() {}
	
	public SubComment(String text) {
		super(text);
		this.setDate(new Date());
		this.setDate(getDate());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
