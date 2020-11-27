package com.com.duotai;

/**
 * @author DingZhenYun
 * @create 2019-02-18 12:20
 */
class GenomtricObject{
    protected String color;
    protected double weight;
    protected GenomtricObject(String color,double weight){
        this.color=color;
        this.weight=weight;
    }
    public GenomtricObject(){}

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public double findArea(){
        System.out.println("superclass");
        return 0.0;
    }
}

class Circle extends GenomtricObject {
    private double radius;
    public Circle(String color,double weight,double radius){
        super(color,weight);
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double findArea(){
        return  Math.PI*this.radius*this.radius;
    }

}

class MyRectangle extends GenomtricObject {
    private double width;
    private double height;
    public MyRectangle(String c,double w,double width,double height){
        super(c,w);
        this.height=height;
        this.width=width;
    }
    public double findArea(){
        return  this.width*this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Test1 t=new Test1();
        Circle c1=new Circle("red",2.3,2.0);
        MyRectangle m1=new MyRectangle("green",2.0,3.0,5.0);
        t.displayGeometricObject(c1);
        t.displayGeometricObject(m1);
        boolean b=t.equalsArea(c1,m1);
        System.out.println(b);
    }
    public void displayGeometricObject(GenomtricObject o){
        System.out.println("面积为："+o.findArea());
    }
    public boolean equalsArea(GenomtricObject o1, GenomtricObject o2){
//        if(o1.findArea()==o2.findArea())
//            return true;
//        else
//            return false;
        return o1.findArea()==o2.findArea();
    }
}
