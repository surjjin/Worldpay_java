<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretentious Shopping </title>
</head>
<body background="welcome.png" style="background-repeat:no-repeat;background-size:cover">
	<h1 style="align: center;">Pretentious Shopping </h1>
	<form action="VerifyUser" method="POST">
        <pre>
        username:<input type="text" name="username" value="" /><br>
        Password:<input type="password" name="password" value="" /><br>
       User Type:<select name="utype">
                            <option>Admin</option>
                            <option>user</option>
                 </select><br>
                 <input type="submit" value="login" name="login" /><br>
                 <a href="registeruser.jsp" >create new account</a>
        </form>
        </pre>
</body>
</html>