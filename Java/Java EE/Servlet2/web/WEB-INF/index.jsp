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
        <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
        <%@taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
        <%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
        <%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
    </head>
    <body>
        
        <%@include file="home.html" %>
        
        
        
        <% out.println("Este es un Scriptles");  %>
        
        <%
            int x = 10;
            for(int i=0; i<10; i++){
                out.println(i+x);
            }  
        %>
        
        ${"Expression language"}
        
        
        
        //  Variables implicitas de JSP
        
        //  Imprimir
        <c:out value="JSLT" />
        
        
        //  Manejo de Expresiones
        <%= 1+1 %>
        
        
        
        <h1>Hello World!</h1>
    </body>
</html>