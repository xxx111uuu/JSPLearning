<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/4
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>复习编写的JSP</title>
</head>
<body>
<form action="/ServletTest_war/reviseServlet" method="post">
    <table>
        <tr>
            <td>输入用户名：</td>
            <td>
                <input type="text" name="username" value="username">
            </td>
        </tr>
        <tr>
            <td>输入密码:</td>
            <td>
                <input type="password" name="password" value="password">
            </td>
        </tr>
        <tr>
            <td>输入年龄:</td>
            <td>
                <input type="text" name="age" value="age">
            </td>
        </tr>
        <tr>
            <td>
                选择性别：
            </td>
            <td>
                <select>
                    <option name="sex">男</option><br/>
                    <option name="sex">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="submit" value="submit">
            </td>
            <td>
                <input type="reset" name="reset" value="reset">
        </tr>
    </table>
</form>

</body>
</html>
