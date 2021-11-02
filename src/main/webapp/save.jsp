<%--
  Created by IntelliJ IDEA.
  User: 79825
  Date: 2021/11/2
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Save</title>
</head>
<body>
<form action="/jsp/save" method="post">
    ID:<input type="text" name="id"/><br/>
    Name:<input type="text" name="name"/><br/>
    Age:<input type="text" name="age"/><br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
