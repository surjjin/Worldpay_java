<%@ page import="worldpayeshop.Product" %>    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	Product p=(Product)request.getAttribute("ainProduct");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin</title>
</head>
<body>
<h1 align="center">Pretentious Shopping </h1><br>
<table bordercolor="black" border="2px">
	<tr>
		<th>pcode</th>
		<th>name</th>
		<th>dsc</th>
		<th>catid</th>
		<th>price</th>	
	</tr>
	<tr>
		<td><%=p.getPcode() %></td>
		<td><%=p.getName() %></td>
		<td><%=p.getDsc() %></td>
		<td><%=p.getCatid() %></td>
		<td><%=p.getPrice() %></td>
	</tr>
</table>


</body>
</html>