package com.lowes.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowes.beans.Address;
import com.lowes.beans.User;
import com.lowes.jdbc.UserCRUD;

import javafx.scene.control.Alert;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    public static boolean createNewUser(User user) throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");
		UserCRUD uCRUD = new UserCRUD();
		uCRUD.create(con, user);
		return false;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String name = request.getParameter("firstname");
		String mail = request.getParameter("mail");
		String no = request.getParameter("contact");
		Address addr = null;
		
		User lowes = new User(0, name, mail, no, addr);
		try {
			createNewUser(lowes);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Can't create user...");
		}
		
		System.out.println(name + " " + mail + " " + no);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("RegistrationServlet.doPost()");
		doGet(request, response);
	}

}
