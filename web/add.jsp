<%-- 
    Document   : add
    Created on : Mar 28, 2024, 12:01:48 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new a Category</h1>
        <h3>${requestScope.error}</h3>
        <form action="add">
            enter ID:<input type="number" name="id"/><br><!-- comment -->
            enter name:<input type="text" name="name"/><br><!-- comment -->
            enter author:<input type="text" name="author"/><br><!-- comment -->
            enter year:<input type="text" name="year"/><br><!-- comment -->
            <input type="Submit" name="name" value="SAVE"/>
        </form>
    </body>
</html>
