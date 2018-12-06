<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.HashSet" %>
<%@page import="worldpayeshop.Product"%>
<%
	String name=(String)session.getAttribute("name");
	
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
<h2>your current cart</h2>


<table bordercolor="black" border="2px">
	<thead>
		<tr>
			<th>pcode</th>
			<th>name</th>
			<th>dsc</th>
			<th>price</th>
		</tr>
	</thead>	
<%
HashSet<Product> hs=(HashSet)session.getAttribute("cart");
	System.out.println(hs.size());
	int total=0;
	if(hs==null)
	 	out.write("no item in cart");
	else{	
	for(Product p:hs){
		total=total+p.getPrice();
	
%>
<form action="DeleteMultipleFromCart">
	<tbody>
		<tr>
			<td><%=p.getPcode() %></td>
			<td><%=p.getName() %></td>
			<td><%=p.getDsc() %></td>
			<td><%=p.getPrice() %></td>		
			<td><a href="RemoveToCart?rpid=<%=p.getPcode()%>">X</a> </td>
			<td><input type="checkbox" name="pid" value="<%=p.getPcode() %>"/></td>
		</tr>
	
<%} %>
		<tr>
			<td>total</td>
			<td>-</td>
			<td>-</td>
			<td><%=total %></td>	
			<td><input type="submit" value="remove" name="remove"/></td>
					
		</tr>
	</tbody>

</table>
</form>
<%} %>
<br>
<a href="buyerpage.jsp">buyerhome</a><br>
<a href="categoryPage.jsp">categorypage</a><br>
</body>
</html>