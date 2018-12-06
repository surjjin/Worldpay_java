<%@page import="worldpayeshop.UserService"%>
<%@page import="worldpayeshop.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String name=(String)session.getAttribute("name");
String username=(String)session.getAttribute("username");
User u=new UserService().searchUser(username);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update profile</title>
</head>
<body>

<h1 align="center">Pretentious Shopping </h1><br>
<h3>Welcome <%=name %></h3>
<form action="UpdateUserProfile">
	<pre>
                Username:<input type="text" name="username" value=<%=u.getUsername() %> /><br>
                Password:<input type="password" name="password" value=<%=u.getPassword() %> /><br>
                Gender:<%=u.getGender() %><br>
                gender  :<input type="radio" name="gender" value="male" /> male
                         <input type="radio" name="gender" value="female" /> female <br>
                name    :<input type="text" name="name" value=<%=u.getName() %> /><br>
                city    :<input type="text" name="city" value=<%=u.getCity() %> /><br>
                        <input type="submit" value="update" name="update" />
            </pre>
</form>
</body>
</html>