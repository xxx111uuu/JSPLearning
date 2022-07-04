<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/6/28
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP练习3代码脚本</title>
</head>
<body>

<%!
    private static Map<String,Object> map;
%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
    }
%>
<%--练习：--%>
<%--1：代码脚本  if语句--%>
<%
    int i = 122;
    if(i==12){
        System.out.println("进入True语句分支:D");
    }else{
        System.out.println("False语句分支！:(");
    }
%>
<%--2：代码脚本  for循环语句--%>
<%
    for(int j=0;j<15;j++){
        System.out.println(j);
    }
%>
<%--3：翻译后java方法中_jspService方法内的代码都可以写--%>

</body>
</html>
