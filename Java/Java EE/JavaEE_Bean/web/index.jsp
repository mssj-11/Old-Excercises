<%-- 
    Document   : index
    Created on : 10/01/2023, 01:48:32 PM
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
        <%  out.println("Hola Mundo!");  %>
        <h1>Hello World!</h1>
        
        <form action="newjsp.jsp" method="POST">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" /></td>
                </tr>
            </table>
            <input type="submit" value="create" />
        </form>
        
    </body>
</html>