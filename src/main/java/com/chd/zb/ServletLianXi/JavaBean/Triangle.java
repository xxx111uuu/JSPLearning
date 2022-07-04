package com.chd.zb.ServletLianXi.JavaBean;
//三角形JavaBean
public class Triangle {
    double e1,e2,e3;//定义三角形的三边
    public  Triangle(){
        e1=1;
        e2=1;
        e3=1;
    }
/*    public void setEdge(double a,double b,double c){
        this.e1=a;
        this.e2=b;
        this.e3=c;
    }*/
    public void setEdge1(double e1){
        this.e1=e1;
    }
    public void setEdge2(double e2){
        this.e2=e2;
    }
    public void setEdge3(double e3){
        this.e3=e3;
    }

    public double[] getEdge(){
        double[] arr={0,0,0};
        arr[0]=this.e1;
        arr[1]=this.e2;
        arr[2]=this.e3;
        return arr;
    }
    public double getHalfLength(){
        return (e1+e2+e3)/2.0;
    }
    public double getArea(){
        if(e1+e2>3&&e1+e3>e2&&e2+e3>e1&&e1>0&&e2>0&&e3>0){
            return Math.sqrt(this.getHalfLength()*((this.getHalfLength()-e1)*(this.getHalfLength()-e2)*(this.getHalfLength()-e3)));
        }else return -1;
    }


}
