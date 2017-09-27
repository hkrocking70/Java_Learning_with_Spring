package com.lowes.mgmt;

import java.util.Arrays;
import java.util.List;

import com.lowes.beans.User;

public class PassiveUserService implements UserService {

	public List<User> getUsers() {
		List<User> users = Arrays.asList(new User(), new User());
		return users;
	}

}
