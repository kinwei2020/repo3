<%--
  Created by IntelliJ IDEA.
  User: kin
  Date: 2021/1/20
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试查询所有账户</a>
    <h3>测试包</h3>
    <form action="account/save" method="post">
        账户：<input type="text" name="name"><br/>
        金额：<input type="text" name="money"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
