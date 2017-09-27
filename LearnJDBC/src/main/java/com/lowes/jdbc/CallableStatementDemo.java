package com.lowes.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");
		
		CallableStatement callStatement = con.prepareCall("{call updateUserContact(?,?)}");
		callStatement.setInt(1, 2);
		callStatement.setString(2, "5241522");
		callStatement.execute();
		con.close();
	}
// To execute a stored procedure Callable StTAEMENT
}
