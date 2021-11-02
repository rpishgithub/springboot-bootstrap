<%--
  Created by IntelliJ IDEA.
  User: 79825
  Date: 2021/11/1
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Info</title>
</head>
<body>
<h1>Student Infomation</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Operation</th>
    </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>
                <a href="/jsp/findById/${student.id}">Edit</a>
                <a href="/jsp/deleteById/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/save.jsp">Add Student</a>
</body>
</html>
