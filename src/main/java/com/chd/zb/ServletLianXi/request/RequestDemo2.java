package com.chd.zb.ServletLianXi.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/req2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void  doGet(HttpServletRequest req,HttpServletResponse resp){
      //GET请求控制
        //System.out.println("get...");
        //1：获取所有参数的map集合
        Map<String,String[]> map  = req.getParameterMap();
        for(String key:map.keySet()){
            //username:zhangsan
            System.out.print(key+":");

            //获取值
            String[] values = map.get(key);
            for(String value:values){
                System.out.print(value+" ");
            }
            System.out.println();
        }
        //2:根据key获取参数值，数组
        String[] hobbies = req.getParameterValues("hobby");
        for(String hobby : hobbies){
            System.out.println(hobby);
        }
        //3：根据key获得单个的参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
    }

    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException {
     //POST请求控制
       // System.out.println("post...");
        this.doGet(req,resp);
//        //1：获取所有参数的map集合
//        Map<String,String[]> map  = req.getParameterMap();
//        for(String key:map.keySet()){
//            //username:zhangsan
//            System.out.print(key+":");
//
//            //获取值
//            String[] values = map.get(key);
//            for(String value:values){
//                System.out.print(value+" ");
//            }
//            System.out.println();
//        }
//        //2:根据key获取参数值，数组
//        String[] hobbies = req.getParameterValues("hobby");
//        for(String hobby : hobbies){
//            System.out.println(hobby);
//        }
//        //3：根据key获得单个的参数值
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
    }

}
