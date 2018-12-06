<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entry Form</title>
</head>
<body>

<form:form action="addproduct" method="POST" modelAttribute="product" enctype="multipart/form-data">
<pre>
	 	Product code  <form:input path="pcode"/><br>
	 	Product name  <form:input path="pname"/><br>
	 	Product price <form:input path="price"/><br>
	 	Product brand <form:radiobuttons path="brand" items="${brandlist}"/><br>
	 	Product specs <form:select path="specs" items="${ specslist}"/><br>
	 	First pic     <input type="file" name="fp" accept="image/*" >
	 	Second Pic    <input type="file" name="sp" accept="image/*" >
	 	
	 	              <input type="submit" value="add" name="submit">    

</pre>
</form:form>  
	<form:errors path="product.pcode" />
	<form:errors path="product.pname" />
	<form:errors path="product.price" />
</body>
</html>