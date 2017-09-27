package com.lowes.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.lowes.beans.User;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, User> userMap = new HashMap<Integer, User>();
		User lowe = new User(111, "Lowes", "lowes@lowes.com", "1234", null);
		userMap.put(33, lowe);
		userMap.put(222, new User(111, "Lowesss", "lowes@lowes.com", "1234", null));
		
		System.out.println(userMap);
	}
}


//Hash Map allowes null values and null keys but Hash Table does not allow null both on key and value