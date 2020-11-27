package com.day20190223pm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
/*
Collection接口 ：方法：①add(Object obj),addAll(Collection coll),size(),clear(),isEmpty();
				    ②remove(Object obj),removeAll(Collection coll),retainAll(Collection coll),equals(Object obj),contains(Object obj)
				        containsAll(Collection coll),hashCode()
				     ③ iterator(),toArray();
 *     		|------List接口：存储有序的，可以重复的元素.---相当于“动态”数组

 *     		|------Set接口：存储无序的，不可重复的元素。---相当于高中的“集合”概念


 */

/**
 * @author DingZhenYun
 * @create 2019-02-23 15:52
 */

//
public class TestCollection {
    public static void t1(){
        Collection collection=new ArrayList();
        //size:集合大小
        int s=collection.size();
        System.out.println(s);
        //add：
        collection.add(11);
        collection.add("234");
        collection.add(true);
        //打印集合
        System.out.println(collection);
        //
        Collection c1=new ArrayList();
        c1.add(222);
        c1.add("34");
        Collection c2=new ArrayList();
        c2.add(222);
        c2.add("234");
        //addAll(Collection c),将c集合的元素全部添加到collection
        boolean b=collection.addAll(c1);
        System.out.println(b);
        System.out.println(collection);
        //isEmpty
        boolean b1=c1.isEmpty();
        System.out.println(b1);
        //clear:清空
        c1.clear();
        System.out.println(c1.size());
        //contains:包含
        boolean bb=collection.contains(11);
        System.out.println(bb);
        //包含全部
        boolean b3=collection.containsAll(c2);
        System.out.println(b3);
        //equals
        System.out.println(c1.equals(c2));
        //remove
        collection.remove("34");
        System.out.println(collection);
        //removall
        boolean b4=collection.removeAll(c2);
        System.out.println(b4);
        System.out.println(collection);
        //retainAll 交集
        System.out.println(collection);
        System.out.println(c2);
        boolean b5=collection.retainAll(c2);
        System.out.println(b5+""+collection);
        //toArray
        Object []obj=c2.toArray();
        for (Object o1:obj) {
            System.out.println(o1);
        }
    }

    public static void main(String[] args) {
        t1();
        t2();
    }

    private static void t2() {
        //迭代器
        Collection c2=new ArrayList();
        c2.add(222);
        c2.add("234");
        Iterator iterator=c2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
