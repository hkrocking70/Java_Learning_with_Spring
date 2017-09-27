package com.lowes.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowes.beans.User;
import com.lowes.jdbc.UserCRUD;

/**
 * Servlet implementation class retrieveUser
 */
@WebServlet("/retrieve")
public class retrieveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public retrieveUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public List<User> retrieve() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");
		} catch (SQLException e) {
			System.out.println("Cannot Create Connection...Try again");
		}

		UserCRUD uCRUD = new UserCRUD();
		List<User> users = uCRUD.retrieve(con);
		return users;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<User> users = null;
		try {
			users = retrieve();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(users.size());
		

		request.setAttribute("userList", users);

		request.getRequestDispatcher("displayUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
