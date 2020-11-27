package com.day20190216;

/**
 * @author DingZhenYun
 * @create 2019-02-16 20:13
 */
class Circle{
//    2.利用面向对象的编程方法，设计类Circle计算圆的面积。
    double r;
    public double area(){
        return Math.PI*r*r;
    }
    public void setR(double r1){
        r=r1;
    }
    public double getR(){
        return r;
    }
}

class Person{
    String name;
    int sex;
    int age;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=78;
        p.name="ddf";
        p.sex=1;
        p.study();
        p.showAge();
        p.addAge(3);
        p.showAge();
        Circle c=new Circle();
        c.area();
    }
}
