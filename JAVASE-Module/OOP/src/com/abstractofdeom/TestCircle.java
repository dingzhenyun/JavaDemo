package com.abstractofdeom;

/**
 * @author DingZhenYun
 * @create 2019-02-20 21:05
 */
/*
定义一个接口用来实现两个对象的比较。
interface CompareObject{
	public int compareTo(Object o);   //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；
	负数代表当前对象小
 }
定义一个Circle类。
定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
定义一个测试类TestInterface，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。

 */
interface CompareObject{
    public int compareTo(Object o);

}

class ComparableCircle extends Circle1 implements Comparable{

    public ComparableCircle(double v) {
        super(v);
    }

    @Override
    public int compareTo(Object o) {
        if(this==o)
            return 0;
        else if(o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle) o;
            if(this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }
            else{
                return 0;
            }
        }
        else {
            throw new RuntimeException("ff");
        }
    }
}

class Circle1{
    private double radius;
    public Circle1(){}
    public Circle1(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle c=new ComparableCircle(1.9);
        ComparableCircle c1=new ComparableCircle(1.9);
        int i=c.compareTo(c1);
        System.out.println(i);

    }

}
