package com.lowes.db;

import java.sql.Connection;
import java.sql.DriverManager;

//Verify the database name

public class DbConnection {
	private static Connection connection;
	private DbConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/que_system", "root", "lowes@123");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		if(connection == null)
			new DbConnection();
		return connection;
	}
}
