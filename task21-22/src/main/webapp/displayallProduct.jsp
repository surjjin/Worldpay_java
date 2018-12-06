<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>pcode</th>
		<th>Name</th>
		<th>Brand</th>
		<th>price</th>
		<th>specs</th>
	</tr>	
	
	<c:forEach var="product" items="${products }">
			<c:url var="removelink" value="removeproduct">
			<c:param name="pcode" value="${product.pcode}" />
			</c:url>
			<c:url var="updatelink" value="updateproduct">
				<c:param name="pcode" value="${product.pcode}" />
			</c:url>
	
	 
		<tr>
			<td>${product.pcode }</td>
			<td>${product.pname }</td>
			<td>${product.brand }</td>
			<td>${product.price }</td>
			<td>${product.specs }</td>
			<td><img src = "imagefirstdisplay?pcode=${product.pcode}" width = 100px height = 100px /></td>
	 		<td><img src = "imageseconddisplay?pcode=${product.pcode}" width = 100px height = 100px /></td>
			
			<td><a href="${removelink}" />remove</td>
			<td><a href="${updatelink}" />update</td>
		</tr>
	</c:forEach>
	</table>
	<a href="index.jsp">home</a>
	
</body>
</html>