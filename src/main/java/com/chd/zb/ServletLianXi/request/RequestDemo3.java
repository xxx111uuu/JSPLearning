package com.chd.zb.ServletLianXi.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
//中文乱码问题解决方式
@WebServlet("/req3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1：解决POST乱码
        request.setCharacterEncoding("UTF-8");//设置字符输入流的编码
        //2：输出username参数
        String username = request.getParameter("username");
        System.out.println(username);
        //3:GET
    }

    @Override
    //解决POST乱码  产生原因： .getReader()获取流 读中文时会乱码
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
