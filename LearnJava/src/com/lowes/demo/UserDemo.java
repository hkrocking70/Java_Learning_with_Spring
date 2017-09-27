package com.lowes.demo;

import java.util.Iterator;
import java.util.Map;

import com.lowes.beans.User;
import com.lowes.crud.UserCRUD;

public class UserDemo {

	public static void main(String[] args) {

		UserCRUD uCRUD = new UserCRUD();

		User lowes = new User(1, "Lowe's", "lowes@lowes.com", "9999999999", null);
		uCRUD.create(lowes);

		User anmol = new User(2, "Anmol", "anmol@example.com", "123456", null);
		uCRUD.create(anmol);

		Map<Integer, User> users = uCRUD.retrieve();

		Iterator it = users.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		uCRUD.update(1, "123");
		
		it = users.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		uCRUD.delete(1);
		it = users.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
			 * User retrievedUser = uCRUD.retrieve(123456);
			 * System.out.println("Uska ID hai: " +
			 * retrievedUser.getUserMail());
			 * 
			 * Address addr = retrievedUser.getAddress();
			 * System.out.println(addr.getCity());
			 * 
			 * System.out.println(addr.getState());
			 */
	}

}
