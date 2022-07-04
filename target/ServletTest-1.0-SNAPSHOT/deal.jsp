<%@ page import="javax.print.DocFlavor" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/3
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读取cookie值</title>
    <meta charset="UTF-8">
</head>
<body>
<%
    //读取cookie值
    Cookie[] cookies = request.getCookies();//从request数据域中获得Cookie集合(request保存HTTP请求的所有数据)
    String user="";
    if(cookies!=null){
        //遍历cookie对象集合
        for(Cookie cookieItem : cookies){
            if(cookieItem.getName().equals("userCookie")){
                 user = cookieItem.getValue();
            }
        }
    }
%>
<h3 align="center">读取cookie的值：</h3>
用户信息：<%= user %>
</body>
</html>
