package com.chd.zb.ServletLianXi.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1...");

/*
        //重定向
        //1：设置响应状态码 302 （临时重定向）
        response.setStatus(302);
        //2:设置响应头：Location
        response.setHeader("Location","/ServletTest_war/resp2");*/
        /*由于上述方法中重定向的响应状态码302和设置响应头中的Location固定，变得仅有资源路径
          因此可以将其简化*/
        //动态获取虚拟目录（路径）
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
