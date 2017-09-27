package com.lowes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.lowes.beans.Address;
import com.lowes.beans.User;

public class UserDemo {

	public static Address getNewAddress(int aid) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Street: ");
		String street = sc.nextLine();

		System.out.println("Enter City: ");
		String city = sc.nextLine();

		System.out.println("Enter State: ");
		String state = sc.nextLine();

		Address addr = new Address(aid, street, city, state);

		return addr;
	}

	public static User getNewUser(int uid, Address addr) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the user Name: ");
		String uname = sc.nextLine();

		System.out.println("Enter the user Email: ");
		String umail = sc.nextLine();

		System.out.println("Enter the user contact no: ");
		String contactNumber = sc.nextLine();

		User u = new User(0, uid, uname, umail, contactNumber, addr);
		return u;
	}

	public static void createNewUser(Connection con) throws SQLException {
		UserCRUD uCRUD = new UserCRUD();
		AddressCRUD aCRUD = new AddressCRUD();
		Address addr = getNewAddress(aCRUD.getMaximumAddressID(con) + 1);
		aCRUD.create(con, addr);

		User lowes = getNewUser(uCRUD.getMaxUserID(con) + 1, addr);
		uCRUD.create(con, lowes);
	}

	public static void getUsers(Connection con) throws SQLException {
		UserCRUD uCRUD = new UserCRUD();
		List<User> users = uCRUD.retrieve(con);
		System.out.println("The details are");
		for (User user : users) {
			System.out.println(user);
		}
	}

	// public static void updateUsers(Connection con,int userId,String
	// contactNumber){
	// UserCRUD uCRUD = new UserCRUD();
	//
	// List<User> users = uCRUD.update(con, userId, contactNumber);
	// for (User user : users) {
	// System.out.println("\n" +user);
	// }
	// }

	public static void getModified(Connection con) throws SQLException {

		System.out.println("Enter the field to update\n1.UserName \n2.UserMail \n3.Contactno \n4.Address");
		UserCRUD crud = new UserCRUD();
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		System.out.println("Enter the User ID");
		int userID = sc.nextInt();

		boolean check = false;
		switch (ch) {
		case 1:
			System.out.println("Enter the new User Name");
			String uname = sc.next();
			System.out.println("user name is: " + uname);
			check = crud.update(con, userID, uname, "uname", 2);
			break;

		case 2:
			System.out.println("Enter the new User mail");
			String umail = sc.next();
			check = crud.update(con, userID, umail, "umail", 3);
			break;

		case 3:
			System.out.println("Enter the new Contact no");
			String uno = sc.next();
			check = crud.update(con, userID, uno, "uno", 4);

		case 4:
			System.out.println("Enter the new Adress details\n");

		}
		if (check == true)
			System.out.println("Successfully Updated");
	}
	
	public static void getDeleted(Connection con) throws SQLException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User ID to delete");
		int uid = sc.nextInt();
		
		UserCRUD uCRUD = new UserCRUD();
		uCRUD.delete(con,uid);
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter Choice: \n1: Create \n2: Display all users \n3.Modify User \n4.Delete \n5.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				createNewUser(con);
				break;
			case 2:
				getUsers(con);
				break;
			case 3:
				getModified(con);
				break;

			case 4:
				getDeleted(con);

			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
			}
		}
	}

}
