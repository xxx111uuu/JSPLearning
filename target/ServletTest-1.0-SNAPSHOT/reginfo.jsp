<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/3
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");//获得用户姓名
    String blog = request.getParameter("blog");//获得博客
    String remark = request.getParameter("remark");//获得备注
    String[] interests = request.getParameterValues("interests");//获得兴趣
    String interStr = "";
    if(interests != null){
        for(String item : interests){
            interStr += item +";";
        }
    }
%>

<html>
<head>
    <title>注册信息</title>
  <meta charset="UTF-8">
</head>
<body>
用户姓名：<%= username%><br>
博客地址：<%= blog%><br>
备注信息：<%= remark%><br>
兴趣爱好：<%= interStr%><br>
</body>
</html>
