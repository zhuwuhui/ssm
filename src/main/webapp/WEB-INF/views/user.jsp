<%--
  Created by IntelliJ IDEA.
  User: zhuwuhui
  Date: 2020/8/19
  Time: 9:24 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>此生不换</title>
</head>
<body>
<table width="100%" border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>地址</td>
        <td>体重</td>
    </tr>
    <c:forEach items="${user}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.sex}</td>
            <td>${user.address}</td>
            <td>${user.weight}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
