<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String username="",password="";
	Cookie c[]=request.getCookies();
	for(Cookie iter:c){
		if(iter.getName().equals("username"))
			username=iter.getValue();
		if(iter.getName().equals("password"))
			password=iter.getValue();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretentious Shopping </title>
</head>
<body background="maxresdefault.jpg" style="background-repeat:no-repeat;background-size:cover">
	
	<h1 align="center">Pretentious Shopping </h1><br>
	<div >
	<form action="VerifyUser" method="get" >
        <pre>
        username:<input type="text" name="username" value="<%=username %>" /><br>
        Password:<input type="password" name="password" value="<%=password %>" /><br>
        Remember:<input type="checkbox" name="remember" value="on"/><br>	
       User Type:<select name="utype">
                            <option>Admin</option>
                            <option>user</option>
                 </select><br>
                 <input type="submit" value="login" name="login" /><br>
                 <a href="registeruser.jsp" >create new account</a>
        </form>
        </pre>
        <div>
</body>
</html>