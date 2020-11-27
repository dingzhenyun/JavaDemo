package com.day20190226;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author DingZhenYun
 * @create 2019-03-02 9:42
 */
//通配符
public class TestFangXing2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("23");
        list.add("gg");
        List<?> list1=list;
        Iterator<?> iterator=list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //但是不能向声明为通配符的集合类中添加对象，NULL例外
//        list1.add("df");
            list1.add(null);
    }
}
