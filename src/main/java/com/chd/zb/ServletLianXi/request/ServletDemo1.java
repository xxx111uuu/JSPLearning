package com.chd.zb.ServletLianXi.request;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//一个Servlet可以配置多个urlPattern
@WebServlet(urlPatterns = {"/Demo2","/Demo3"})//urlPatterns是字符串数组形式
public class ServletDemo1 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse resp){
        System.out.println("GET!!!");
    }
    @Override
    protected void doPost(ServletRequest req,ServletResponse resp){
        System.out.println("POST!!!");
    }
}
