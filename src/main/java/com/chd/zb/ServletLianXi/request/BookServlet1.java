package com.chd.zb.ServletLianXi.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class BookServlet1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)throws  IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //快速自动填写返回值类型 ctrl+alt+v
        PrintWriter writer = resp.getWriter();
        writer.println("Hello BookServlet1!~");

    }
}
