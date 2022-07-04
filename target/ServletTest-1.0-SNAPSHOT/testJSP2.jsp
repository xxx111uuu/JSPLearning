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
    <title>JSP练习2表达式脚本</title>
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

<%--练习：
1：输出整形
2：输出浮点型
3：输出字符串
4：输出对象--%>
<%=12%>
<%=22.222%>
<%="输出字符串"%>
<%=map%>
<jsp:include page="testJSP2.jsp"/>
</body>
</html>
