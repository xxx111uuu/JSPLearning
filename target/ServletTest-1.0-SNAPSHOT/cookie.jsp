<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/3
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="UTF-8">
<%
  //写入cookie对象
    request.setCharacterEncoding("UTF-8");

    Cookie cookie = new Cookie("userCookie", "Hello，World");//创建并实例化Cookie对象
    cookie.setMaxAge(60*60*24*30);//设置Cookie生存期 30天
    response.addCookie(cookie);//使用response对象的addCookie()方法保存cookie对象
%>
<html>
<head>
    <title>cookie测试</title>
</head>
<body>

</body>
</html>
