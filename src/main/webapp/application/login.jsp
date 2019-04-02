<%--
  Created by IntelliJ IDEA.
  User: Phoenix
  Date: 2019/4/3
  Time: 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form method="post" action="student/login">
        姓名：<input type="text" id="stuName" name="stuName" >
        密码：<input type="text" id="password" name="password"/>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
