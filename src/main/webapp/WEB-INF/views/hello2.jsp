<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: 오전 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>hello2 입니다</h2>
    <button onclick="param1()">파라미터 전송</button>
</body>
<script>
    const param1 = () => {
      // location.href = "/hello-parma1?email=qkfhandur&password=1111"
      const email = "qkfhandur";
      const password = "1111";
      location.href = "/hello-param2?email="+email+"&password="+password;
    }
</script>
</html>
