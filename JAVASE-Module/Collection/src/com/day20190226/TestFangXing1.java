package com.day20190226;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DingZhenYun
 * @create 2019-02-27 20:15
 */
//3.泛型于继承的关系
    /*
    A是B的子类，那List<A>就不是List<B>的子接口
     */
public class TestFangXing1 {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    private static void t3() {
        // ? extends E:可以存放E及其子类
        // ? super E:可以存放E及其父类
        List<? extends Number> list1=null;
        List<Object> list2=null;
        List<Integer> list3=null;
        //list1=list2;
        list1=list3;
        List<? super Number> ll=null;
        ll=list2;


    }

    private static void t2() {
        //通配符 ？  list<A> list<B>都是List<?>的子类
        List<?> list=null;
        List<Object> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list=list1;
        list=list2;
    }

    private static void t1() {
        Object obj=null;
        String str="fdfd";
        obj=str;
        Object [] o1=null;
        String [] strings=new String[]{"23","ff"};
        o1=strings;

        List<Object> list=null;
        List<String> list1=new ArrayList<>();
        //list=list1;错误
    }
}
