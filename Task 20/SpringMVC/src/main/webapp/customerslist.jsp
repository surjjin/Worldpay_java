<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>List-Of-All-Customers</h3>
	<table border="2">
	<tr><td>Code</td><td>Name</td><td>Address</td></tr>
	<c:forEach var="customer" items="${customerslist}">
		<c:url var="removelink" value="deletecustomer">
			<c:param name="code" value="${customer.code}"/>
		</c:url>
		<c:url var="updatelink" value="updatecustomer">
			<c:param name="code" value="${customer.code}"/>
		</c:url>
		<tr>
			<td>${customer.code}</td>
			<td>${customer.cname}</td>
			<td>${customer.address}</td>
			<td><a href="${removelink}"/>remove</td>
			<td><a href="${updatelink}"/>update</td>
		<tr>
	</c:forEach>
	</table>
	<a href="index.jsp">Home</a>
</body>
</html>