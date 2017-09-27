package com.lowes.exceptionss;

public class ExceptionDemo {
	public static void main(String[] args) {

		/*
		 * try { System.out.println(4 / 0); } catch (Exception e) {
		 * System.out.println("Oops"); }
		 */

		try {
			System.out.println("Name is: " + getName(500));
		} catch (UserNotFound e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fin !");
		}

	}

	static String getName(int id) throws UserNotFound {
		String name = "";

		if (id == 100) {
			name = "Himanshu";
		} else {
			if (id == 200) {
				name = "Anmol";
			}
			else {
				throw new UserNotFound(id);
			}
		}

		return name;
	}
}

// We can have try-catch,try-finally or try-catch-finally blocks.......
//throws is that whoever is calling the exception is going to handled it....but throw is purposely throwing an exception...