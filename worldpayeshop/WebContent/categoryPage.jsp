<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="worldpayeshop.Connect"%>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String name=(String)session.getAttribute("name");
	Cookie ck[]=request.getCookies();
	String category=null;
	for(Cookie c:ck){
		if(c.getName().equals("category"))
		{
			category=c.getValue();
		}
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>category</title>
</head>
<body>
<h1 align="center">Pretentious Shopping </h1><br>
<h3>Welcome <%=name %></h3>
<marquee> New Offers on <%= category%></marquee>
<%
	
	Statement st=new Connect().connect().createStatement();
	ResultSet rs=st.executeQuery("select * from category");
	while(rs.next()){
		int ccode=rs.getInt(1);
		String s=rs.getString(2);
		response.addCookie(new Cookie(ccode+"","0"));
%>
	<a href="productpage.jsp?category=<%=ccode %>&catname=<%=s%>"><%=s %></a><br>
<%} 
	
	
%>
</body>
</html>