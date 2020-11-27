package com.modle;
//单例模式：使一个类只能创建一个对象
/**
 * @author DingZhenYun
 * @create 2019-02-19 20:16
 */
//饿汉式
class A{
    //1.私用化构造器
    private A(){}
    //2.在类的内部创建一个类的实例
    private static A a=new A();
    //3.私有化此对象，通过公共方法来调用
    //4.此公共方法，只能通过类来调用
    public static A getInstance(){
        return  a;
    }

}

//懒汉式  ：可能存在线程安全
class B{
    private B(){}
    private static B b=null;
    public static B getInstance(){
        if(b==null)
            b=new B();
        return b;
    }

}

public class TestSingleton {


    public static void main(String[] args) {
        A a1= A.getInstance();
        A a2= A.getInstance();
        System.out.println(a1==a2);
        B b1= B.getInstance();
        B b2= B.getInstance();
        System.out.println(b1==b2);
    }

}
