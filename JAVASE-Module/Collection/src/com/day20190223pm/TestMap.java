package com.day20190223pm;

import java.util.*;

/**
 * @author DingZhenYun
 * @create 2019-02-24 10:56
 */
/*
Map接口：存储“键-值”对的数据 ----相当于高中的“函数y = f(x)” (x1,y1)  (x2,y2)
>key是不可重复的，使用Set存放。value可以重复的，使用Collection来存放的。
    一个key-value对构成一个entry(Map.Entry)，entry使用Set来存放。
>添加、修改 put(Object key,Object value)  删除remove(Object key)  获取get(Object key) size() / keySet() values()  entrySet()
 *     		|-----HashMap：主要的实现类，可以添加null键，null值
			|-----LinkedHashMap：是HashMap的子类，可以按照添加进Map的顺序实现遍历
			|-----TreeMap：需要按照key所在类的指定属性进行排序。要求key是同一个类的对象。
			对key考虑使用自然排序 或 定制排序
			|-----Hashtable：是一个古老的实现类，线程安全的，不可以添加null键，null值不建议使用。
				|-----子类：Properties：常用来处理属性文件
 */
//Map接口
    /*
    元素查询的操作：
Object get(Object key)//获取key的值,没有此key,返回NULL
boolean containsKey(Object key)
boolean containsValue(Object value)
int size()
boolean isEmpty()
boolean equals(Object obj)
Object put(Object key,Object value)//添加
添加、删除操作：
Object remove(Object key)//删除
void putAll(Map t)
void clear()



     */
    /*
    向HashMap中添加元素时，会调用Key类的equals方法,判断是否相等，如果相等，则覆盖前一个
     */
public class TestMap {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("ff",23);
        map.put("22",221);
        map.put("aa",21);
        map.put("af",24);
        System.out.println(map);
        map.remove("ff");
        System.out.println(map);
        System.out.println(map.get("22"));
        System.out.println("---------------");
        T1();
    }

    private static void T1() {
        /*遍历Map
        元视图操作的方法：
    Set keySet()
    Collection values()
    Set entrySet()
         */
        Map map=new HashMap();
        map.put("aa",23);
        map.put("cc",21);
        map.put("hh",211);
        map.put("jj",211);
        map.put("dd",24);
        map.put(null,null);
        map.put("hh",211);
        //1.遍历key
        Set set=map.keySet();
        for (Object obj:set) {
            System.out.println(obj);
        }
        System.out.println("-----------------");
        //2.遍历value
        Collection collection=map.values();
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历Map
        Set set1=map.keySet();
        for (Object obj:set1) {
            System.out.println(obj+" ->"+map.get(obj));
        }
        System.out.println("----------------------");
        System.out.println("======================");
        Set set2=map.entrySet();
        for (Object obj:set2) {
            Map.Entry m=(Map.Entry) obj;
            //System.out.println(m.getKey()+"---->"+m.getValue());
            System.out.println(m);
        }

    }
}
