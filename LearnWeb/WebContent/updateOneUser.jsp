<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.lowes.beans.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h1>Welcome to Fake Portal</h1></center><br>
	<% 
		List<User> u = (List<User>) request.getAttribute("userList");
		for(User user : u){
	%>
	
	<form action="updateUser" method="post">
		User ID : <input type="number" name="userid" value="<% out.print(user.getUserId());%>" readonly><br>
		Name : &nbsp;&nbsp;<input type="text" name="firstname" value="<% out.print(user.getUserName());%>"/><br>
		Mail : &nbsp;&nbsp;<input type="email" name="mail" value="<% out.print(user.getUserMail()); %>"/><br>
		Number : <input type="text" name="contact" value ="<% out.print(user.getContactNumber()); %>"><br><br>
		<input type="submit" name = "submit" value="Submit">
	</form>
	<% } %>
</body>
</html>