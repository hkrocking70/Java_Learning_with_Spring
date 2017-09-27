<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lowe's India</title>
</head>
<body>
	<center><h1>Welcome to Fake Portal</h1></center><br>
				
	<a href = "userCreateForm.jsp" method="post">Create User</a><br>
	<a href = "retrieve">Retrieve User</a><br>
	<a href = "update">Update User</a><br>
	<a href = "deleteUser">Delete a User</a><br>
	<form method="post" action="login">
		<input type="submit" value = "Logout">
	</form>
	<%
		if (session.getAttribute("userDetails") == null) {
			out.println("No user");
		} else {
			out.println(session.getAttribute("userDetails"));
		}
	%>
</body>
</html>