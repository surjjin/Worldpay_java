<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"<html>
    <head>
        <title>register user</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="welcomenew.png" style="background-repeat:no-repeat;background-size:cover">
        
        <form action="UserRegister" method="post" >
            <pre>
                User name:<input type="text" name="username" value="" /><br>
                Password:<input type="password" name="password" value="" /><br>
                gender  :<input type="radio" name="gender" value="male" /> male
                         <input type="radio" name="gender" value="female" /> female <br>
                name    :<input type="text" name="name" value="" /><br>
                city    :<input type="text" name="city" value="" /><br>
                        <input type="submit" value="register" name="register" />
            </pre>
        </form>
            
    </body>
</html>