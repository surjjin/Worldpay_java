<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
 URL url = new URL("http://localhost:8080/RestApp/productRestAPI");

HttpURLConnection con = (HttpURLConnection)url.openConnection();
con.setDoOutput(true);
con.setDoInput(true);
con.setRequestProperty("Content-Type", "application/json");
con.setRequestProperty("Accept", "application/json");
con.setRequestMethod("POST");

JSONObject customer   = new JSONObject();
customer.put("pcode", request.getParameter("pcode"));
customer.put("pname", request.getParameter("pname"));
customer.put("price", request.getParameter("price"));

OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
wr.write(customer.toString());
wr.flush();

//display what returns the POST request

StringBuilder sb = new StringBuilder();  
int HttpResult = con.getResponseCode(); 
if (HttpResult == HttpURLConnection.HTTP_OK) {
    BufferedReader br = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String line = null;  
    while ((line = br.readLine()) != null) {  
        sb.append(line + "\n");  
    }
    br.close();
    out.println(sb);
} else {
    System.out.println(con.getResponseMessage());  
}
try{
	
	response.sendRedirect("index.jsp");
	}
catch(Exception e){}

%>