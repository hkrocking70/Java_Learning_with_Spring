package com.lowes.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallableStatementInOutDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");
		
		CallableStatement callStatement = con.prepareCall("{call getAddress(?,?,?)}");
		callStatement.setInt(1, 3);
		callStatement.registerOutParameter(2,java.sql.Types.VARCHAR);
		callStatement.registerOutParameter(3,java.sql.Types.VARCHAR);
		callStatement.execute();
		
		String street = callStatement.getString(2);
		System.out.println("Street is : " + street);
		System.out.println("City: " + callStatement.getString(3));
		
		con.close();
	}

}
