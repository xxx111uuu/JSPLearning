package com.chd.zb.ServletLianXi.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Demo1")
public class HttpServletDemo01 extends HttpServlet {
    @Override//ctrl+o 复写快捷键
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post...");
    }
}
