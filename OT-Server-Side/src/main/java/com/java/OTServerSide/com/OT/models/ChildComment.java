package com.java.OTServerSide.com.OT.models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChildComment extends Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	public ChildComment() {}
	
	public ChildComment(String text) {
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
