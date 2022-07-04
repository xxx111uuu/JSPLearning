<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/1
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>三角形的UseBean练习</title>
</head>
<body >
<jsp:useBean id="triangle"  class="com.chd.zb.ServletLianXi.JavaBean.Triangle" scope="request"/>
<form method="post">
    输入三角形的第一条边:<input type="text" name="a"   value="1" size="5"/>
    输入三角形的第二条边:<input type="text" name="b"   value="1" size="5"/>
    输入三角形的第三条边:<input type="text" name="c"   value="1" size="5"/> <br>
    提交:<input type="submit"   value="提交"/>
</form>
        <%-- 注意:setProperty中的 name的值为bean（对应的JavaBean的对象） property的值是setXxx中的xxx！ param是表单中给表格设置的"name" --%>
    <jsp:setProperty name="triangle" property="edge1" param="a"/>
    <jsp:setProperty name="triangle" property="edge2" param="b"/>
    <jsp:setProperty name="triangle" property="edge3"  param="c" />
    三角形的周长:<%= 2*triangle.getHalfLength()%>
    三角形的面积:<%= triangle.getArea()%>
</body>
</html>
