<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="com.sandica.model.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User list</title>
</head>
<body>

<%
ArrayList<Users> list = new ArrayList<Users>();
list = (ArrayList<Users>) request.getAttribute("users");
if (list.isEmpty()){
	out.println("empty, yo!");
}
else
{
	for(Users category : list) {
	    
	    out.println(category.getName());
	    out.println(category.getPassword());
	}
}

%>
<span>

</span>

</body>
</html>