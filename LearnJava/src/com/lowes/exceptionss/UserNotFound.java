package com.lowes.exceptionss;

public class UserNotFound extends Exception {
	int id;

	public UserNotFound(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public String getMessage() {
		return "No user found for the given ID: " + this.id;
	}

}
