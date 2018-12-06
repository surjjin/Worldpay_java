<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="worldpayeshop.Product" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Product p=(Product)request.getAttribute("ainProduct");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
</head>
<body>
<h1 align="center">Pretentious Shopping </h1><br>
<form action="SearchProduct">
<pre>
	Enter Pid:<input type="text" value="" name="pid"/><br>
			  <input type="button" value="search" name="search">
</pre>	
</form>
</body>
</html>