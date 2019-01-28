package com.hcmony.test.memory;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 353900218049881029L;

	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
