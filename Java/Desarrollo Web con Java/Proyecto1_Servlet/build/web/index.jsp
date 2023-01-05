<%-- 
    Document   : index
    Created on : 3/01/2023, 03:23:07 PM
    Author     : HP -   MSS
--%>
<!--    TAGLIB  solo en caso de que se usen 1x1 o todos    -->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@taglib prefix="f" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="s" uri="http://java.sun.com/jstl/sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--    Ejemplo error page  -->
<%@page errorPage="" %>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formas para agregar el codigo de Java en JSP</h1>
        <% out.println("Esto es un scriptles"); %>
        
        
        ${"expression language"}
        
        <c:out value="Esto es JSTL" />
        
        <%= 10 + 20  %>
        <!--    Expresiones Regulares    -->
        <%= request.getContextPath()    %>
        
        <%
          int x = 0;
          
          if(x ==1){
              out.println("x = 1");
          }else{
              out.println("x != 1");
          }
          

          
          
          
        %>
    </body>
</html>