package com.cafe24.springcontainer.user;

public class Friend {
	
	private String name;

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Friend(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
	
	
	
	
}
