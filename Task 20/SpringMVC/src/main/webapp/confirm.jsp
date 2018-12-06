<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Updated/Inserted Data</h3>
	<h4>Following Information Was Stored/Updated : </h4>
	<hr>
	<pre>
	Code	${customer.code}
	
	Name	${customer.cname}
	
	Address	${customer.address}
	</pre>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>