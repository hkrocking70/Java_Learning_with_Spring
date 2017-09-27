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
	
	<table border="2">
	<%
		List<User> u = (List<User>) request.getAttribute("userList");
		for (User user : u) {
	%>
			<tr>
				<td><% out.print(user.getUserId()); %></td>
				<td><% out.print(user.getUserName()); %></td>
				<td><% out.print(user.getUserMail()); %></td>
				<td><% out.print(user.getContactNumber()); %></td>
				<td><form action="finalUpdate"><button type="submit" name = "edit" value="<% out.print(user.getUserId()); %>">Edit</form></td>
				<td><form action="deleteUser"><button type="submit" name = "delete" value="<% out.print(user.getUserId()); %>">Delete</form>
			</tr>
			
	<%}
	%>
	</table>
</body>
</html>