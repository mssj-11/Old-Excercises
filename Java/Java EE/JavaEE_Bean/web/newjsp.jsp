<%-- 
    Document   : newjsp
    Created on : 10/01/2023, 03:07:25 PM
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
        <h1>Hello World!</h1>
        <!--  Usando la instruccion  -->
        //  Opcion 1
        <%
          String name;
          name = request.getParameter("name");
        %>
        
        //  Opcion 2
        ${  newbean["name"] };
        
        
    <!--  Importando/Usando el archivo Java Bean  -->
    <jsp:useBean id="newbean" class="beans.MyBean" scope="session"></jsp:useBean>
    <jsp:setProperty name="newbean" property="id" value="<%= name %>"></jsp:setProperty>
    </body>
</html>