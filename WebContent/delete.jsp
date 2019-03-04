<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete user</title>
</head>
<body>
<span>You are about to delete the following user:</span><br><br>
<span>Username = <%=session.getAttribute("username") %></span><br>
<span>Password = <%=session.getAttribute("password") %></span><br>
<span> and the ID = <%=session.getAttribute("userid") %></span><br>

<form action="delete" method="post">  
<input type="text" name="id" value="<%=session.getAttribute("userid") %>"/><br/>   
<input type="submit" value="Delete"/>  
</form>
</body>
</html>