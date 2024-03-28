<%-- 
    Document   : list
    Created on : Mar 24, 2024, 8:39:35 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of book</h1>
        <h3>
            <a href="add.jsp">Add new</a>   
        </h3>
        <table border="1px" width ="40%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>author</th>
                <th>year</th>
            </tr>
            <c:forEach items="${requestScope.data}" var = "c">
                <c:set var="id" value="${c.id}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.name}</td>
                    <td>${c.author}</td>
                    <td>${c.year}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
