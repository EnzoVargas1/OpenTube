package com.java.OT.models;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChildComment extends Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="root_comment_id")
	private RootComment rootComment;
	
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

	public RootComment getRootComment() {
		return rootComment;
	}

	public void setRootComment(RootComment rootComment) {
		this.rootComment = rootComment;
	}
	
	

}
