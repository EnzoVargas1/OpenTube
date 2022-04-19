package com.java.OTServerSide.com.OT.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.java.OTServerSide.com.OT.security.models.User;
@Entity
public class Channel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String about;
	private List<String> links;
	private int views = 0;
	private int likes = 0;
	private int dislikes = 0;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "channels")
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "video")
	private List<Video> videos = new ArrayList<Video>();
	
	public Channel() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<String> getLinks() {
		return links;
	}

	public void setLinks(List<String> links) {
		this.links = links;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	
	public void countStats() {
		for(int i = 0; i < videos.size(); i++) {
			setViews(getViews() + videos.get(i).getViews());
			setLikes(getLikes() + videos.get(i).getLikes());
			setDislikes(getDislikes() + videos.get(i).getDislikes());
		}
	}
}
