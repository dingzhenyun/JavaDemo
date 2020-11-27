package com.random;

import java.util.Random;

/**
 * @author DingZhenYun
 * @create 2019-03-16 19:59
 */
public class Test {
    public static void main(String[] args) {
        //public int nextInt(int maxValue)	产生[0,maxValue)范围的随机整数，包含0，不包含maxValue；
        //public double nextDouble()  产生[0,1)范围的随机小数，包含0.0，不包含1.0。
        Random r=new Random();
        int a=r.nextInt(100);//0-99
        System.out.println(a);
        int a1=r.nextInt(100)+1;
        System.out.println(a1);
        double d=r.nextDouble();
        System.out.println(d);
    }
}
