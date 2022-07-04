<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/7/3
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>学员注册</title>

</head>
<body>
<div align="center">请输入注册信息
    <form name="form1" method="post" action="reginfo.jsp">
        <table border="0" align="center">
            <tr>
                <td>用户姓名：</td>
                <td><input type="text" name="username" value="username"></td>
            </tr>
            <tr>
                <td>博客地址：</td>
                <td><input type="text" name="blog" value="blog"></td>
            </tr>
            <tr>
                <td>备注信息：</td>
                <td><input type="text" name="remark" value="remark"></td>
            </tr>
            <tr>
                <td>兴趣爱好：</td>
                <td>
                    <input type="checkbox" name="interests" value="cpp">cpp
                    <input type="checkbox" name="interests" value="java">java
                    <input type="checkbox" name="interests" value="go">go
                    <input type="checkbox" name="interests" value="python">python
                </td>
            </tr>
            <!-- 提交  -->
            <tr>
                <td>
                    <input type="submit" value="submit">
                </td>
                <td>
                    <input type="reset" value="reset">
                </td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
