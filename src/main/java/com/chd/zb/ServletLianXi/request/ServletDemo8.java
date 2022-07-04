package com.chd.zb.ServletLianXi.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo8 extends HttpServlet {
        @Override
    protected void doGet(HttpServletRequest res, HttpServletResponse resp){

            System.out.println("demo 8 GET...");
        }
    protected void doPost(HttpServletRequest res, HttpServletResponse resp){

    }
}
