package com.lowes.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lowes.beans.User;

public class LoginService {

	String jdbcDriverClass;
	String connectionString;
	String dbUser;
	String dbPassword;
	Connection con;

	public LoginService(String jdbcDriverClass, String connectionString, String dbUser, String dbPassword) {
		super();
		this.jdbcDriverClass = jdbcDriverClass;
		this.connectionString = connectionString;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;

		try {
			Class.forName(jdbcDriverClass);
			con = DriverManager.getConnection(connectionString, dbUser, dbPassword);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error occured.");
		}
	}
	
	public User getUser(String uMail) {
		PreparedStatement pstmt;
		try {
			User user = new User();
			pstmt = con.prepareStatement("Select * from user where umail = ?");
			pstmt.setString(1, uMail);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				user.setAddress(null);
				user.setContactNumber(result.getString("contactno"));
				user.setUserId(result.getInt("uid"));
				user.setUserMail(uMail);
				user.setUserName(result.getString("uname"));
				
				return user;
			}
		} catch (SQLException e) {
			System.out.println("Error occured.");
		}
		return null;
	}

	public int getUser(String uName, String uPass) {
		
		PreparedStatement pstmt;int comp_id=0;
		try {
			pstmt = con.prepareStatement("Select comp_id from company where uid = ? and passcode = ?");
			pstmt.setString(1, uName);
			pstmt.setString(2, uPass);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				comp_id = result.getInt("comp_id");
			}
			
			return comp_id;
		} catch (SQLException e) {
			System.out.println("Error occured.");
		}
		return 0;		
	}

}
