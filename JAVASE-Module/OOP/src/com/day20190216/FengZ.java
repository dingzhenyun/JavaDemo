package com.day20190216;
/*
创建程序,在其中定义两个类：Person和TestPerson类。定义如下：
    用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。在TestPerson类中实例化Person类的对象b，
    调用setAge()和getAge()方法，体会Java的封装性
 */
/**
 * @author DingZhenYun
 * @create 2019-02-17 12:54
 */
class P{
    private int age;
    private String name;
    public P(){
        age=11;
        name="发发发";
    }
    public P(int age,String name){
       this.age=age;
       this.name=name;
    }
    public void setage(int i){
        if(i<0||i>130)
            System.out.println("你输入的有错误");
        else
            age=i;
    }
    public int getAge(){
        return age;

    }
    public void setName(String s){
        name=s;
    }

    public String getName() {
        return name;
    }
}

public class FengZ {
    public static void main(String[] args) {
        P p=new P();
        p.setage(23);
        System.out.println(p.getAge());
        P p1=new P();
        System.out.println(p1.getAge()+":"+p1.getName());
        P p2=new P();
        System.out.println(p2.getAge()+":"+p2.getName());
    }
}
