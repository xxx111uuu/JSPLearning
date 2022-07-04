package com.chd.zb.ServletLianXi.JavaBean;
public class Triangle {
    double edge1,edge2,edge3;
    public Triangle(){
        edge1=1;
        edge2=1;
        edge3=1;
    }
    public void setEdge1(double e1){
        this.edge1=e1;
    }
    public double getEdge1(){
        return this.edge1;
    }
    public void setEdge2(double e2){
        this.edge2=e2;
    }
    public double getEdge2(){
        return this.edge2;
    }
    public void setEdge3(double e3){
        this.edge3=e3;
    }
    public double getEdge3(){
        return this.edge3;
    }
    public double getArea(){
        if(edge1>0&&edge2>0&&edge3>0&&edge1+edge3>edge2&&edge2+edge3>edge1&&edge2+edge1>edge3){
                double length=(edge1+edge2+edge3)/2.0;
                return Math.sqrt(length*(length-edge1)*(length-edge2)*(length-edge3));
        }else
            return -1;
    }


}