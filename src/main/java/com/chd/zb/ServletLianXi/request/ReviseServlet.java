package com.chd.zb.ServletLianXi.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reviseServlet")
public class ReviseServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        //获得请求方式
        String method = req.getMethod();
        System.out.println("请求方式:"+method);
        //获得请求参数
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String password = req.getParameter("password");
        System.out.println("用户姓名是:"+username);
        System.out.println("用户密码是:"+password);
        System.out.println("用户年龄是:"+age);

        //获得请求地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
        //获得请求主机名
        String remoteHost = req.getRemoteHost();
        System.out.println(remoteHost);
    }
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp){
        this.doGet(req,resp);
    }
    @Override
    //service才是处理页面HTTP请求的逻辑。
    public void service(HttpServletRequest req,HttpServletResponse resp){
            doPost(req,resp);
    }
}
