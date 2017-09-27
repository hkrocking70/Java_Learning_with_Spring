<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.lowes.beans.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="login" method="post">
		UserName : <input type="text" name="uName"> <br>
		Password : <input type="password" name="pWord"> <br>
		<input type="submit" value="Fetch User">
	</form>
	<%
		if (session.getAttribute("compId") == null) {
			out.println("No user");
		} else {
			out.println(session.getAttribute("compId"));
		}
	%>
</body>
</html>