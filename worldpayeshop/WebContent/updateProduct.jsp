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
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Pretentious Shopping </h1><br>

<form action="UpdateProduct" method="get">
	<pre>
	pcode:<input type="text" value="<%=p.getPcode() %>" name="pcode"/><br>
	name:<input type="text" value="<%=p.getName() %>" name="name"/><br>
	dsc:<input type="text" value="<%=p.getDsc() %>" name="dsc"/><br>
	catid:<input type="text" value="<%=p.getCatid() %>" name="catid"/><br>
	price:<input type="text" value="<%=p.getPrice() %>" name="price"/><br>
		  <input type="submit" value="update" name="update"/>	
	</pre>
</form>

</body>
</html>