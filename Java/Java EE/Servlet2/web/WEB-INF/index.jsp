<%-- 
    Document   : index
    Created on : 6/01/2023, 07:39:04 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% out.println("Este es un Scriptles");  %>
        
        <%
          for(int i=0; i<10; i++){
              out.println("");
          }  
        %>
        
        <h1>Hello World!</h1>
    </body>
</html>