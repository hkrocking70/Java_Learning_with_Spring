package com.lowes.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lowes.beans.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "driverClass", value = "com.mysql.jdbc.Driver", description = "MySQL JDBC Driver")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcDriverClass = request.getServletContext().getInitParameter("jdbcDriverClass");
		String connectionString = request.getServletContext().getInitParameter("connectionString");
		String dbUser = request.getServletContext().getInitParameter("dbUser");
		String dbPassword = request.getServletContext().getInitParameter("dbPassword");
		
		//String uMail = request.getParameter("umail");
		
		String uName = request.getParameter("uName");
		String uPass = request.getParameter("pWord");
		
		LoginService service = new LoginService(jdbcDriverClass, connectionString, dbUser, dbPassword);
		//User user = null;
		int comp_id = service.getUser(uName,uPass);
		
		Cookie lowesCookie = new Cookie("user","lowes");
		response.addCookie(lowesCookie);
		
		if(comp_id != 0){
			HttpSession session = request.getSession(true);
			session.setAttribute("compId",comp_id);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		/*session = request.getSession(true);
		if (user!= null)
			session.setAttribute("userSession", user.getUserName() + "\'s Session");
		session.setAttribute("userDetails", user);
		request.getRequestDispatcher("login.jsp").forward(request, response);
*/	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		/*request.getSession().invalidate();
		response.sendRedirect("index.jsp");*/
		
	}

}
