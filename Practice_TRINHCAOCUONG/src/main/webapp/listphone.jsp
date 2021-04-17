<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 04/17/2021
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Phone</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<div class="w3-container">
    <h2 class="col-8 offset-2 text-center font-weight-bold my-3">List Phone</h2>
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach var="p" items="${requestScope.phones}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.brand}</td>
                <td>${p.description}</td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
