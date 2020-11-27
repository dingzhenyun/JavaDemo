package com.day20190216;

/**
 * @author DingZhenYun
 * @create 2019-02-16 20:44
 */
/*
2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。

 */
class T{
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int i,int j){
        System.out.println(i*j);
    }
    public void mOL(String str){
        System.out.println(str);
    }
    public int max(int i,int j){
        return (i>j)?i:j;
    }
    public double max(double i,double j){
        return (i>j)?i:j;
    }
    public double max(double i,double j,double k){
        double max=i;
        if(max<j)
            max=j;
        if(max<k)
            max=k;
        System.out.println(max);
        return max;
    }
}

public class OverLoadTest {
    public static void main(String[] args) {
        T t=new T();
        t.mOL(1);
        t.mOL("dddd");
        t.mOL(1,4);
        t.max(3,4);
        t.max(1.4,5.6);
        t.max(1.2,3.4,55.5);
    }
}
