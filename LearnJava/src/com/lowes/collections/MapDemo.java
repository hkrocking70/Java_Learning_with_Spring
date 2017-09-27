package com.lowes.collections;

import java.util.HashMap;
import java.util.Map;

import com.lowes.beans.User;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, User> userMap = new HashMap<Integer, User>();
		User lowe = new User(111, "Lowes", "lowes@lowes.com", "1234", null);
		userMap.put(1111, lowe);
		userMap.put(222, new User(111, "Lowesss", "lowes@lowes.com", "1234", null));
		System.out.println(userMap);
	}
}
