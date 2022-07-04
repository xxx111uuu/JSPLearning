package com.chd.zb.ServletLianXi.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
响应字符数据:设置字符数据的响应体
 */
@WebServlet("/resp3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码方法
        response.setContentType("text/html;charset=utf-8");
        //获取字符输出流
        PrintWriter writer = response.getWriter();
       //content-type设置响应头信息
       // response.setHeader("content-type","text/html");
        //响应内容给中文会乱码

        writer.write("你好");
        writer.write("<h1>aaa</h1>");
        //write流不需要手动关闭,当Response结束时会将其自动关闭

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
