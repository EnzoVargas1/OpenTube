package com.java.OTServerSide.com.OT.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.websocket.Decoder.Binary;

@Entity
public class Profile {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;
	 private String title;
	 private Binary image;
	 
	 public Profile() {}
	 
	 public Profile(String title, Binary Image){
		 this.title = title;
		 this.image = image;
	 }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Binary getImage() {
		return image;
	}

	public void setImage(Binary image) {
		this.image = image;
	}
	 
	 
}
