<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>Hello World !!</h2>
  <a href="/hello1">Hello1로 이동하기</a>
  <button onclick="fun1()">Hello2로 전송받기</button>
</body>
<script>
    const fun1 = () => {
        location.href = "/hello-param1?name=guping&age=28"
    }
</script>
</html>
