package com.day20190223pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DingZhenYun
 * @create 2019-02-24 15:17
 */
//Collections工具类，操作Collection,及Map
public class TestCollections {
    public static void main(String[] args) {
        t1();
        System.out.println("-------------");
        t2();
    }

    private static void t2() {
        /*
        Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object min(Collection)
        Object min(Collection，Comparator)
        int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        void copy(List dest,List src)：将src中的内容复制到dest中
        boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
         */
        List list=new ArrayList();
        list.add(23);
        list.add(12);
        list.add(223);
        list.add(123);
        list.add(2223);
        list.add(2223);
        list.add(2223);
        System.out.println(list);
        Object obj=Collections.max(list);
        System.out.println(obj);
        int count=Collections.frequency(list,2223);
        System.out.println(count);
        //List list1=new ArrayList();
        // Exception in thread "main" java.lang.IndexOutOfBoundsException:
        // Source does not fit in dest
        List list1=Arrays.asList(new Object[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list1);
    }

    public  static void t1(){
        /*
        reverse(List)：反转 List 中元素的顺序
        shuffle(List)：对 List 集合元素进行随机排序
        sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
          swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
         */
        List list=new ArrayList();
        list.add(23);
        list.add(12);
        list.add(223);
        list.add(123);
        list.add(2223);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list,0,2);
        System.out.println(list);
    }

}
