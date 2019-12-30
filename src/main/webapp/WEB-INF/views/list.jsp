<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>NWPU校园招聘</title>
</head>

<body>
list：

<c:forEach var="item" items="${items}">
    <li>${item.name}</li>
    <li>${item.money}</li>
</c:forEach>
</body>
</html>