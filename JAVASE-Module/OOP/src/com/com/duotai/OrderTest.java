package com.com.duotai;
/*
编写Order类，有int型的orderId，String型的OrderName，相应的getter()和setter()方法，
两个参数的构造器，重写父类的equals()方法：
public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等
 */
/**
 * @author DingZhenYun
 * @create 2019-02-18 21:53
 */
class Order{
    private  int orderId;
    private  String orderName;
    public Order(){
    }
    public Order(int orderId,String orderName){
        this.orderId=orderId;
        this.orderName=orderName;
    }

    public void setOrderId(int orderId){
        this.orderId=orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        else if(obj instanceof Order){
            Order o=(Order)obj;
            return this.orderName.equals(o.orderName)&&this.orderId==o.orderId;
        }
        else{
                return false;
        }
    }

    public int getOrderId() {
        return orderId;
    }
    public String getOrderName(){
        return orderName;
    }
}

public class OrderTest {
    public static void main(String[] args) {
        Order o1=new Order(33,"FF");
//        Order o2=new Order(31,"44f");
        Order o2=new Order(33,"FF");

        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));
    }


}
