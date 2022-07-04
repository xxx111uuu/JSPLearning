<%@page contentType="text/html;charset=utf-8"  language="java" %>

<meta charset="UTF-8">
<html>
<head>

<title > 获得三角形的面积</title>
</head>

<body>
<jsp:useBean id="triangle" class="com.chd.zb.ServletLianXi.JavaBean.Triangle" scope="application"/>
<form action="" method="post" >
    <table>
        <tr>
           <td>
               输入三角形的第一个边edge1
           </td>
            <td>
                <input type="text" value="1" name="edge1">
            </td>
        </tr>
        <tr>
            <td>
                输入三角形的第二个边edge2
            </td>
            <td>
                <input type="text" name="edge2" value="1"/>
            </td>
        </tr>

        <tr>
            <td>
                输入三角形的第三个边edge3
            </td>
            <td>
                <input type="text" name="edge3" value="1">
            </td>
        </tr>
    </table>
        <input type="submit" value="submit" name="submit"><br/>
        <input type="reset" name="reset" value="reset">
</form>
<jsp:setProperty name="triangle" property="edge1" param="edge1" />
<jsp:setProperty name="triangle" property="edge2" param="edge2" />
<jsp:setProperty name="triangle" property="edge3" param="edge3" />
三角形的三个边是：
edge1:<jsp:getProperty name="triangle" property="edge1"/><br>
edge2:<jsp:getProperty name="triangle" property="edge2"/><br>
edge3:<jsp:getProperty name="triangle" property="edge3"/><br>
三角形的面积是：
<%= triangle.getArea()%>

</body>
</html>