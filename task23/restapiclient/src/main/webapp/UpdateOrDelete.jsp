<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="org.json.JSONObject"%>
<%
    String ch=request.getParameter("choice");
    if(ch.equals("Update")){
        URL url = new URL("http://localhost:8080/RestApp/productRestAPI");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestMethod("PUT");
        JSONObject customer   = new JSONObject();
        customer.put("pcode", request.getParameter("t1"));
        customer.put("pname", request.getParameter("t2"));
        customer.put("price", request.getParameter("t3"));
        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        wr.write(customer.toString());
        wr.flush();
        //display what returns the POST request
        StringBuilder sb = new StringBuilder();  
        int HttpResult = con.getResponseCode(); 
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;  
            while ((line = br.readLine()) != null) {  
                sb.append(line + "\n");  
            }
            br.close();
            out.println("Updated :");
            out.println(sb);
        } else {
          System.out.println(con.getResponseMessage());  
        }  
    }else if(ch.equals("Delete")){
        URL url = new URL("http://localhost:8080/RestApp/productRestAPI/"+request.getParameter("t1"));
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        //con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestMethod("DELETE");
        //display what returns the POST request
        StringBuilder sb = new StringBuilder();  
        int HttpResult = con.getResponseCode(); 
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;  
            while ((line = br.readLine()) != null) {  
                sb.append(line + "\n");  
            }
            br.close();
            out.println("Deleted :");
            out.println(sb);
        } else {
          System.out.println(con.getResponseMessage());  
        }
    }
%>