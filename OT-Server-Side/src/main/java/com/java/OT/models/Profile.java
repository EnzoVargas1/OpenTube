package com.java.OT.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.websocket.Decoder.Binary;

import com.java.OT.security.models.User;

@Entity
public class Profile {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;
	 private String title;
	 private Binary image;
	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	 @JoinColumn(name="user_id")
	 private User user;
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
