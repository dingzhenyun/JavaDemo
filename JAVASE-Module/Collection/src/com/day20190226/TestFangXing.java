package com.day20190226;

import java.util.ArrayList;
import java.util.List;

/**
*@author DingZhenYun
*@create 2019-02-26 13:19
*/
//自定义泛型类
class Order<T>{
    private String name;
    private int id;
    private T t;
    List<T> list=new ArrayList<>();
    //泛型方法
    public <E> E getE(E e){
        return e;
    }
    //数组复制到集合
    public <E> List<E> ArrayToList(E[] e,List<E> e1){
        for(E e2:e){
            e1.add(e2);
        }
        return e1;

    }
    public void add(){
        list.add(t);
    }
    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }


    public void add(T t){
        list.add(t);
    }
    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", t=" + t +
                '}';
    }

    public Order() {
    }

    public Order(String name, int id, T t) {
        this.name = name;
        this.id = id;
        this.t = t;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//class SubOrder<T> extends Order<T>{}
class SubOrder extends Order<Integer> {

}

public class TestFangXing {
    public static void main(String[] args) {
        //泛型类的使用：指定泛型的类型
        Order<Boolean> o=new Order<Boolean>();
        o.setT(true);
        System.out.println(o.getT());
        o.add();
        List<Boolean> l=o.list;
        System.out.println(l);
        SubOrder sb=new SubOrder();
        List<Integer> list=sb.list;
        System.out.println(list);
        //当通过对象调用泛型方法时，指明泛型方法的类型
        int i=o.getE(123);
        System.out.println(i);
        double d=o.getE(12.3);
        System.out.println(d);
        Integer [] a=new Integer[]{1,33,32,45};
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=o.ArrayToList(a,list2);
        System.out.println(list3);

    }
}
