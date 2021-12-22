package com.bridgelabz.greeting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETINGS")
public class Greeting {
	@Id
	private long id;
	private String message;

	public Greeting() {
		super();
		id = 0;
		message = "";
	}

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.message = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}