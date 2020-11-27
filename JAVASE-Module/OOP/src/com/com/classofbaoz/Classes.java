package com.com.classofbaoz;
/*
包装类
 */
/**
 * @author DingZhenYun
 * @create 2019-02-19 11:51
 */
public class Classes {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i);
        Integer i1=new Integer(i);//基本数据类型转包装类
        System.out.println(i1);
        int i2=i1.intValue();//包装类转基本类型
        System.out.println(i2);
        //jDK5.0 自动拆箱和装箱
        int b1=33;
        Integer b2=b1;//装箱
        int b3=b2;//拆箱

        //基本，包装类--》String类  调用String类的valueof()
        int c1=22;
        boolean c2=true;
        String str=String.valueOf(c1);
        String str1=String.valueOf(c2);
        System.out.println(str);
        System.out.println(str1);
        //String ->基本，包装类  调用包装类的parseXXX()
        int c11=Integer.parseInt(str);
        boolean c22=Boolean.parseBoolean(str1);
        System.out.println(c11);
        System.out.println(c22);
    }
}
