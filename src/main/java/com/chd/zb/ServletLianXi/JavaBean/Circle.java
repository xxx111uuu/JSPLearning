package com.chd.zb.ServletLianXi.JavaBean;
//JavaBean里面必须要包含无参构造，且其内的所有方法都必须是Public
public class Circle {
    double radius;
    public Circle(){
        radius=1;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double R){
        this.radius=R;
    }
    public double getArea(){
        return 3.1415926*radius*radius;
    }
    public double getLength(){
        return 2*3.1415926*radius;
    }

}
