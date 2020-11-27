package com.day20190223pm;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author DingZhenYun
 * @create 2019-02-23 21:43
 */
/*
TreeSet:
1.元素要求同一个类
2.元素按指定的顺序排序，像String,包装类按从小到大顺序
3.自然排序
    默认排序
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
//        ts.add("dd");
//        ts.add("AA");
//        ts.add("gg");
//        ts.add("bb");
//        ts.add("MM");
//        ts.add("GH"); Person p=new Person("fff",23);
        Person p1=new Person("FFF",23);
         //ts.add("dff");

        ts.add(new Person("SS",23));
        ts.add(new Person("AA",43));
        ts.add(new Person("FF",23));
        ts.add(new Person("VSVV",2));
        ts.add(new Person("EE",223));
        ts.add(new Person("JJ",213));
        ts.add(new Person("FF",263));
        Iterator iterator=ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
