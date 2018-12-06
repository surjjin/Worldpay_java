<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display product	</title>
</head>
<body>
	<form:form modelAttribute="product">
		<pre>
				Product pcode <form:input path="pcode"/>
				Product name  <form:input path="pname"/><br>
	 			Product price <form:input path="price"/><br>
	 			Product brand <form:input path="brand" /><br>
	 			Product specs <form:input path="specs"/><br>
	 			
	 			Images <img src = "imagefirstdisplay?pcode=${product.pcode}" width = 100px height = 100px />
	 				   <img src = "imageseconddisplay?pcode=${product.pcode}" width = 100px height = 100px />
	 	
		</pre>
	</form:form>
	
	<a href="index.jsp">home</a>
</body>
</html>