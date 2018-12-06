<%@page import="java.util.HashMap"%>
<%@page import="worldpayeshop.ProductService"%>
<%@page import="worldpayeshop.UserService"%>
<%@page import="java.util.HashSet" %>
<%@page import="worldpayeshop.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String name = (String)session.getAttribute("name");
	Cookie c=new Cookie("category",request.getParameter("catname"));
	c.setMaxAge(24*60*60*7);
	response.addCookie(c);
	
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 tdansitional//EN" "http://www.w3.org/td/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product page</title>

</head>
<body>
<h1 align="center">Pretentious Shopping </h1><br>
<h3>Welcome <%=name %></h3>
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
	int ccode=Integer.parseInt(request.getParameter("category"));
	Cookie ck[]=request.getCookies();
	int count=0;
	for(Cookie c1:ck){
		if(c1.getName().equals(ccode+""))
		{
			count=Integer.parseInt(c1.getValue());
			count++;
			c1.setValue(count+"");
			response.addCookie(c1);
		}
	}
	int rate=0;
	if(count<5)
		rate=1;
	else if(count<10)
	rate=5;
	else
		rate=10;
	
HashSet<Product> hs=new ProductService().searchByCategory(ccode);
	for(Product p:hs){
		
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+count);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+rate);
	System.out.println(p.getPrice() +rate*100);
%>	
<form action="AddMultipleToCart">
	<tbody>
		<tr>
			<td><%=p.getPcode() %></td>
			<td><%=p.getName() %></td>
			<td><%=p.getDsc() %></td>
			<td><%=p.getPrice() +rate*100%></td>
			<td><input type="checkbox" name="pid" value="<%=p.getPcode() %>"/></td>	
			<td><a href="AddToCart?pid=<%=p.getPcode()%>">add to cart</a> </td>
		</tr>
	</tbody>
<%} %>

			<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><input type="submit" value="add" name="add"/></td>
			</tr>
</table>
</form>
<a href ="displaycart.jsp">cart</a><br>
<a href="buyerpage.jsp">buyerhome</a>
</body>
</html>