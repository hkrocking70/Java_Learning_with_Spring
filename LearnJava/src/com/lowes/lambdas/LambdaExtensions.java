package com.lowes.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExtensions {

	public static void main(String[] args) {

		List<User> users = Arrays.asList(new User("Anmol", "Agarwal", 100), new User("Himanshu", "Kumar", 10000),
				new User("Mukul", "Jha", 500));

		// System.out.println(users);
		/*
		printCondition(users, new Condition() {
			@Override
			public boolean check(User user) {
				if (user.fname.startsWith("A")) {
					return true;
				}
				return false;
			}
		});
		*/

		printCondition(users, (user) -> {
			if (user.lname.startsWith("J"))
				return true;
			return false;
		});
	}

	private static void printCondition(List<User> users, Condition con) {
		for (User user : users) {

			if (con.check(user)) {
				System.out.println(user);
			}
		}
	}

	@SuppressWarnings("unused")
	private static void printAll(List<User> users) {
		for (User user : users) {
			System.out.println(user);
		}
	}

}

@FunctionalInterface
interface Condition {
	boolean check(User user);
}

class User {
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	String fname;
	String lname;
	int sal;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String fname, String lname, int sal) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return fname + " : " + lname + " : " + sal;
	}
}