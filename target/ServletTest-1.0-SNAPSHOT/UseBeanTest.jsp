<%@ page import="com.chd.zb.ServletLianXi.JavaBean.Circle" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/1
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>圆的UseBean</title>
</head>
<body>
<%-- 通过useBean标记获得bean  可以把bean理解给其对应的Java类的一个“对象” --%>
<%-- 如id="circle" 可以理解为创建一个Circle类的名称为circle的对象 --%>
  <jsp:useBean id="circle" class="com.chd.zb.ServletLianXi.JavaBean.Circle" scope="application"/>
    <prem>
    圆的初始半径是：<%= circle.getRadius()%><br>
    圆的初始面积是：<%= circle.getArea()%><br>
    圆的初始周长是：<%= circle.getLength()%><br>
    更改圆的周长变为：<% circle.setRadius(2.5); %> <%= circle.getRadius()%><br>
    更改后的圆的面积是：<%= circle.getArea()%><br>
    更改后的圆的周长是：<%= circle.getLength()%><br>
    </prem>
</body>
</html>
