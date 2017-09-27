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

/**
 * Servlet implementation class updateUserData
 */
@WebServlet("/updateUser")
public class updateUserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateUserData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public static boolean updateOldUser(User user) throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lowes_db", "root", "lowes@123");
		UserCRUD uCRUD = new UserCRUD();
		return uCRUD.updateUser(con, user);
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idUpdate = Integer.valueOf(request.getParameter("userid"));
		String name = request.getParameter("firstname");
		String mail = request.getParameter("mail");
		String no = request.getParameter("contact");
		Address addr = null;
		
		User lowes = new User(idUpdate, name, mail, no, addr);
		try {
			if(updateOldUser(lowes)){
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
