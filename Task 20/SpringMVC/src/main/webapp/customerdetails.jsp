<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Customer-Details</h3>
	<hr>
	<pre>
	<form action="savechanges" method="post">
	Code	<input type="text" name="code" value="${customer.code}"/>
	
	Name	<input type="text" name="cname" value="${customer.cname}"/>
	
	Address	<input type="text" name="address" value="${customer.address}"/>
	
			<input type="submit" value="Modify"/>
	</form>
	</pre>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>