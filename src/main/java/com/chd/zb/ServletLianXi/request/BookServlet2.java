package com.chd.zb.ServletLianXi.request;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

import static sun.applet.AppletResourceLoader.getImage;
@WebServlet("/bookDraw")
public class BookServlet2 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)throws IOException  {
        req.setCharacterEncoding("UTF-8");
        double width = Double.parseDouble(req.getParameter("width"));
        double height = Double.parseDouble(req.getParameter("height"));
        resp.setContentType("image/jpeg");
        Ellipse2D.Double ellipse = new Ellipse2D.Double(400 - width / 2, 300 - height / 2, width, height);
        BufferedImage image = getImage(ellipse);
        try {
            OutputStream outClient = resp.getOutputStream();
            boolean boo = ImageIO.write(image,"JPEG",outClient);//发送到客户端
        }catch (Exception exp){}
    }
    BufferedImage getImage(Shape shape){
        int width=800,height=700;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.fillRect(0,0,width,height);
        Graphics2D g_2D = (Graphics2D) g;
        g_2D.setColor(Color.CYAN);
        g_2D.fill(shape);
        return image;
    }

    @Override
    public void  doGet(HttpServletRequest req,HttpServletResponse resp){

    }
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp){
        this.doGet(req,resp);
    }

}
