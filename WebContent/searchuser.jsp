<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User page</title>
</head>
<body>
<h1>Delete user</h1>
<span>Search user by ID</span><br><br>
<form action="search" method="post">  
<input type="text" name="id" value="Username's ID..." onclick="this.value=''"/><br/>   
<input type="submit" value="Search"/>  
</form> 

</body>
</html>