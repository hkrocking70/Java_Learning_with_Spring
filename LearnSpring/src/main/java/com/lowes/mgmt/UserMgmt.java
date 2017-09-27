package com.lowes.mgmt;

import java.util.List;

import com.lowes.beans.User;

public class UserMgmt {
	UserService service;
	
	/*public void setService(UserService service) {
		this.service = service;
	}*/

	public void setService(UserService service) {
		this.service = service;
	}

	List<User> getUsers() {
		return service.getUsers();
	}
}
