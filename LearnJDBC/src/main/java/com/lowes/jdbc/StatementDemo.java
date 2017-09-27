package com.lowes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("executing");

		// Loading the driver
		Class.forName("com.mysql.jdbc.Driver");

		// Establishing the Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");

		// Statement smt = con.createStatement();
		
		// ResultSet results = smt.executeQuery("select * from user");
		
		PreparedStatement prs = con.prepareStatement("insert into address values(?, ?, ?, ?);");
		prs.setInt(1, 4);
		prs.setString(2, "BTM");
		prs.setString(3, "Bengaluru");
			
		prs.execute();

		/*
		List<User> users = new ArrayList<User>();
		while (results.next()) {
			users.add(new User(results.getInt("uid"), results.getString("uname"), null, null, null));
		}
		for (User user : users) {
			System.out.println(user);
		}
		*/

	}

}
