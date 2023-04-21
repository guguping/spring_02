<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>hello5.jsp</h2>
<h3>학생정보</h3>
<table class="table table-dark table-hover" style="text-align: center">
    <tr>
        <th>id</th>
        <th>이름</th>
        <th>학번</th>
    </tr>
<%--items: 반복할 대상 , var:반복변수--%>
<%--for(StudentDTO s: sList)--%>

<c:forEach items="${sList}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>${s.studentName} </td>
        <td>${s.studentNumber} </td>
    </tr>
</c:forEach>

</table>
</body>
</html>
