package com.chd.zb.ServletLianXi.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/DEMO5","/DEMO6"})
public class ServletDemo5 extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest res, HttpServletResponse resp){
            System.out.println("demo 5 GET...");
        }
    protected void doPost(HttpServletRequest res, HttpServletResponse resp){

    }
}
