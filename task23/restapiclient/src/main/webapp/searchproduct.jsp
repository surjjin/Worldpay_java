<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%
        String id=request.getParameter("pcode");
        URL url = new URL("http://localhost:8080/RestApp/productRestAPI/"+id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
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
                //out.println(result);
		conn.disconnect();  
                JSONObject json=new JSONObject(result);
                String s1=json.getString("pcode");
                String s2=json.getString("pname");
                String s3=json.getString("price");
%>
<html>
    <body>
        <h3>Customer Details</h3>
        <form action="UpdateOrDelete.jsp">
            pcode       <input type="text" name="t1" value="<%=s1%>"/>
            pname        <input type="text" name="t2" value="<%=s2%>"/>
            price     <input type="text" name="t3" value="<%=s3%>"/>
                        <input type="submit" value="Update" name="choice"/>
                        <input type="submit" value="Delete" name="choice"/>
        </form>
    <a href="index.jsp">Home</a>
    </body>
</html>
  