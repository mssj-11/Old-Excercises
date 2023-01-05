<%-- 
    Document   : usingJavaBeans
    Created on : 5/01/2023, 12:50:15 PM
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
        <h1>Formulario</h1>
        
        <%
            String id;
            String name;
            
            id = request.getParameter("id");
            name = request.getParameter("name");
            
        %>
        
        
        <!--    Alcanse de sesiones -->
        <jsp:useBean id="mybean" class="My_Java_Bean" scope="session"></jsp:useBean>
        <!--  Forma de acceder a los elementos  -->
        <jsp:setProperty name="mybean" property="id" value="<%= id %>" />
        <jsp:setProperty name="mybean" property="name" value="<%= name %>" />
        
        
        <!--  Otra forma de acceder a los elementos  -->
        $(mybean["id"])
        $(mybean["name"])
        
        
    </body>
</html>