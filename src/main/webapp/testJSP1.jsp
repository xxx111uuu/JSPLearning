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
    <title>JSP练习1声明脚本</title>
</head>
<body>
<%--练习：--%>
<%--1：声明类的属性--%>
<%--2：声明static静态代码块--%>
<%--3：声明类方法--%>
<%--4：声明内部类--%>
<%--声明类的属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String,Object> map;
%>
<%--声明Static静态代码块--%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
    }
%>
<%--声明类方法--%>
<%!
        public int test(){
            return  11;
        }
%>
<%--声明内部类--%>
<%!
    public static class Test{
        private  Integer id;
        private  String name="张三";
    }
%>
</body>
</html>
