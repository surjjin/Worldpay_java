<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	URL url=new URL("http://localhost:8080/RestApp/productRestAPI/json");
	HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	conn.setRequestMethod("GET");
	conn.setRequestProperty("Accept", "application/json");
	BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String result="";
	String output;
	System.out.println("Output from Server .... \n");
	while ((output = br.readLine()) != null) {
                    result=result+output;
		//System.out.println(output);
	}
          //  out.println(result);
	conn.disconnect();  
	
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
        <tr>
            <td>PCode</td>
            <td>PName</td>
            <td>price</td>
        </tr>
<%
                JSONArray jarray=new JSONArray(result);
                for(int i=0; i<jarray.length();i++){
                    JSONObject json=jarray.getJSONObject(i);
                    String s1=json.getString("pcode");
                    String s2=json.getString("pname");
                    int s3=json.getInt("price");
%>
	<tr>
    <td><%=s1%></td>
    <td><%=s2%></td>
    <td><%=s3%></td>
</tr>
<%
                }
%>
    </table>
    <a href="index.jsp">Home</a>
    
</body>
</html>