<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>用户列表</h3>
    <table border="2" cellspacing="0" cellpadding="5" style="text-align: center">
        <tr>
            <th>序号</th>
            <th>用户ID</th>
            <th>用户姓名</th>
            <th>用户生日</th>
            <th>用户性别</th>
            <th>用户住址</th>
        </tr>
            <c:if test="${not empty ListUser}">
                <c:forEach var="user" items="${ListUser}" varStatus="us">
                    <tr>
                        <td>${us.count}</td>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.birthday}</td>
                        <td>${user.sex}</td>
                        <td>${user.address}</td>
                    </tr>
                </c:forEach>
            </c:if>
    </table>
</body>
</html>
