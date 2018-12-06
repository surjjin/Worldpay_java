<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String name=(String)session.getAttribute("name");
	if(name==null)
		response.sendRedirect("index.jsp");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Pretentious Shopping </h1><br>
<h3>Welcome <%=name %></h3>
<hr>
<pre>
	<a href="updateProfile.jsp">Update-Profile</a>
	<a href="categoryPage.jsp">Explore-Store</a>
	<a href="displaycart.jsp">View-Cart</a>
	<a href="Logout">Logout</a>
	<a href="allproduct.jsp">all product</a>
</pre>
<hr>
</body>
</html>