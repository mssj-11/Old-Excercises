<%-- 
    Document   : index
    Created on : 5/01/2023, 12:17:43 PM
    Author     : HP
--%>
<!--    Java Bean con JSP   -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Formulario</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="" method="post">
            <table>
                <tr>
                    <td>ID: </td>
                    <td><input type="text" name="id" /></td>
                </tr>
            </table>
            <input type="submit" value="create" />
        </form>
    </body>
</html>