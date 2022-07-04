<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/29
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>9*9乘法表练习</title>
</head>
<body>
<%--输出9*9乘法表--%>
<%
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < i+1; j++) {
            %>
            <%= j +"x" +i + "=" + (i*j) %>
  <%      }
    }
%>
</body>
</html>
