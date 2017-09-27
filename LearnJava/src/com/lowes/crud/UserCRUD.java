package com.lowes.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.FREE_MEM;

import com.lowes.beans.Address;

import com.lowes.beans.User;

public class UserCRUD {

	Map<Integer, User> userMap = new HashMap<>();
	public boolean create(User user) {
		userMap.put(user.getUserId(), user);
		return true;
	}

	/*
	public User retrieve(int userId) {
		System.out.println("User mil gaya.");

		User anmol = new User();
		anmol.setUserName("Anmol Agarwal");
		anmol.setUserMail("anmol@example.com");

		Address lowesAddr = new Address();
		lowesAddr.setCity("Bangalore");
		lowesAddr.setState("xyz");
		anmol.setAddress(lowesAddr);

		User anmolAg = new User(11407, "anmol", "anmol@xyz.com", "12021", new Address());
		return anmol;

	}
	*/
	
	public Map<Integer, User> retrieve() {
		return userMap;
	}

	public boolean update(int userId, String contactNumber) {
		User u = userMap.get(userId);
		u.setContactNumber(contactNumber);
		return true;
	}

	public boolean delete(int userId) {
		User u = userMap.remove(userId);
		return true;
	}

}
