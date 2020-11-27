package com.day20190226;

import java.util.*;

/**
 * @author DingZhenYun
 * @create 2019-02-25 9:41
 */
//泛型
    /*
    1.在集合中使用泛型
    2.自定义泛型
    3.泛型于继承的关系
    4.通配符
     */
public class dayfangxing {
    public static void main(String[] args) {
        a1();
        a2();
    }

    private static void a2() {
        //map泛型
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("ff",34);
        map.put("aa",23);
        map.put("vv",33);
        map.put("xx",14);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        for (Map.Entry<String,Integer> o:set) {
            //System.out.println(o);
            System.out.println(o.getKey()+"->"+o.getValue());
        }
    }

    private static void a1() {
        //集合中使用泛型
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(23);
        list.add(97);
        list.add(23);
        //list.add("ff");
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
