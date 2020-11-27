package com.xunhuan;

/**
 * @author DingZhenYun
 * @create 2019-03-17 14:17
 */
/*
 *  方法的递归调用
 *    方法自己调用自己
 *  适合于,方法中运算的主体不变,但是运行的时候,参与运行的方法参数会变化
 *  注意:
 *     递归一定要有出口, 必须可以让程序停下
 *     递归次数不能过多
 *     构造方法,禁止递归
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(t1(100));
        System.out.println(t2(5));
        System.out.println(t3(12));
    }

    private static int  t3(int i) {
        //方法递归,计算斐波那契数列
        if(i==1||i==2)
            return 1;
        return  t3(i-1)+t3(i-2);
    }

    private static int  t2(int n) {
        if(n==1)
            return 1;
        return n*t2(n-1);
    }

    private static int t1(int n) {
        /*
         *  计算 1+2+3+100和 = 5050
         *  计算规律:
         *    n+(n-1)+(n-2)
         *    100+(100-1)+(99-1)+...1
         */
        if(n==1)
            return 1;
        return t1(n-1)+n;

    }
}
