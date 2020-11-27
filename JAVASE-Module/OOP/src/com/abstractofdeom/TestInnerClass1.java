package com.abstractofdeom;

/**
 * @author DingZhenYun
 * @create 2019-02-22 13:51
 */
//关于局部内部类的使用
public class TestInnerClass1 {
    public static void main(String[] args) {

    }
}

class OutClass{
    //局部内部类
    //使用较少
    public void mrthod1(){
        class InnerClass{

        }
    }
    //常常使用一个方法，使其返回值使一个接口或类的对象，而接口或类在方法中创建
    public Comparable getComparable(){
        //1.创建一个实现Comparable的实现类
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        //2.返回类实现的对象
        return new MyComparable();
    }
    public Comparable getComparable1(){
        //返回一个实现Comparables的匿名内部类对象
        return new Comparable() {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}