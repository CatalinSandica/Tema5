<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="com.sandica.model.*"%>
<%@ page import ="java.sql.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User list</title>
</head>
<body>
<h2>Welcome to User List</h2>
<%
Connection connection = null;
Statement statement = null;
PreparedStatement prepStatement = null;
ResultSet resultSet;
Users usr = new Users();
try {
	Class.forName("com.mysql.cj.jdbc.Driver");	
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "catalin.sandica", "Password123");
	System.out.println("Connection OK");
}
catch (Exception e) {
	e.printStackTrace();
}
List<Users> list = new ArrayList<Users>();
statement = connection.createStatement();
resultSet = statement.executeQuery("SELECT * FROM users");

	while(resultSet.next()){
		
		String username = resultSet.getString("userName");
		String password = resultSet.getString("userPass");
		list.add(new Users(username,password));
		}
	int userno = 0;
%>

<table>
<% for ( Users users: list){ %>
		<% 
		userno = userno +1;%>
		<tr><td>User no. <%=userno %></td></tr> 
         <tr><td>Username = <%=users.getName() %></td></tr>
         <tr><td>Password = <%=users.getPassword() %></td></tr>
         <tr><td></td></tr> 
      <%}%>
</table>

</body>
</html>