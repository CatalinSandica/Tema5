<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome <%=session.getAttribute("username") %></title>
</head>
<body>
<h2>Welcome, <%=session.getAttribute("username") %></h2>
<span>Here's your password, <b><%=session.getAttribute("password") %></b></span>
</body>
</html>