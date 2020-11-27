package com.date;


import java.util.Date;

/**
 * @author DingZhenYun
 * @create 2019-03-15 9:17
 */
/*
 * 与时间相关的类：
 * 1.System 类下的currentTimeMillis();
 * 2.Date类:java.util.Date
 *    如何创建其实例；其下的方法：toString()、getTime()
 *    (以及其子类java.sql.Date)
 * 3.SimpleDateFormat类
 * 4.Calendar类
 */
public class Test {
    public static void main(String[] args) {
        date();
    }
    public static void date(){
        //创建实例
        java.sql.Date j=new java.sql.Date(1234321535L);
        System.out.println(j);//1970-01-15
        Date d=new Date();
        System.out.println(d);//Fri Mar 15 09:25:08 CST 2019
        System.out.println(d.getTime());//1552613125786
        Date d1=new Date(1552613125786L);
        System.out.println(d1);//Fri Mar 15 09:25:08 CST 2019
    }

}
