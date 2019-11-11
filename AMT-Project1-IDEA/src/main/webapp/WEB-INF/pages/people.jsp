<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maximilian
  Date: 11.11.19
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>People Display</title>
</head>
<body>
    <h1>People</h1>
    <table>
        <c:forEach items="${people}" var="Person">
            <tr>
                <td>${Person.id}</td>
                <td>${Person.name}</td>
                <td>${Person.password}</td>
                <td>${Person.address}</td>
                <td>${Person.telephone}</td>
                <td>${Person.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
