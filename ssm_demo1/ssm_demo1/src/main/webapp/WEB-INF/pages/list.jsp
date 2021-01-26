<%--
  Created by IntelliJ IDEA.
  User: kin
  Date: 2021/1/20
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>账户列表。。。。。。</h3>
    <c:forEach items="${list}" var="account">
        ${account.name} ${account.money}<br>
    </c:forEach>
</body>
</html>
