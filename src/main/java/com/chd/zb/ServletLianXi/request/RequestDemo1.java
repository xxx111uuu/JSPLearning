package com.chd.zb.ServletLianXi.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void  doGet(HttpServletRequest req,HttpServletResponse resp){
        //    String getMEthod（）：获得请求方式：GET
        String method = req.getMethod();
        System.out.println(method);
        //    String getContextPath（）：获得虚拟目录（项目访问路径）：/request-demo 动态获取！
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //    StringBuffer getRequestURL():获得URL（统一资源定位符）：http://localhost:8080/request-demo/req1
        StringBuffer url = req.getRequestURL();
        System.out.println(url.toString());
        //     String getRequestURI():获得URI(统一资源标识符）：/request-demo/req1
        String uri = req.getRequestURI();
        System.out.println(uri);
        //            String getQueryString():获得请求参数（GET方式）：username=xxx&password=xxx
        String queryString = req.getQueryString();
        System.out.println(queryString);


        //-----------------
        //获得请求头：user-agent： 浏览器的版本信息
        String agent = req.getHeader("user-agent");
        System.out.println(agent);

    }

    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException {
            //获取POST请求参数(请求体）
        //1：获取字符输入流
        BufferedReader br = req.getReader();
        //2:读取参数
        String line = br.readLine();
        System.out.println(line);
        this.doGet(req, resp);

    }

}
