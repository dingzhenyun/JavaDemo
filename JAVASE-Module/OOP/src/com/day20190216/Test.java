package com.day20190216;
/*
1、将对象作为参数传递给方法。
题目要求：
（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		public void printAreas(Cirlce c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
在main方法中调用printAreas()方法，调用完毕后输出当前半径值
 */
/**
 * @author DingZhenYun
 * @create 2019-02-16 21:22
 */

class PassObject{
    public void printAreas(Circle c, int time){
        System.out.println("Radius"+"\t\t"+"area");
        for(int i=1;i<=time;i++){
            c.setR(i);
            System.out.println(c.getR()+c.area());
        }
        System.out.println("now radius is"+ (++time));
    }

}

public class Test {
    public static void main(String[] args) {
        PassObject po=new PassObject();
        Circle c=new Circle();
        po.printAreas(c,5);

    }
}
