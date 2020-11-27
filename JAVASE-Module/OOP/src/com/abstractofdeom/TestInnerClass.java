package com.abstractofdeom;

import java.util.Objects;

/**
 * @author DingZhenYun
 * @create 2019-02-22 13:36
 */
/*
1.创建内部类对象
2.区分内部类于外部类的对象
3.局部内部类的使用
 */
class P1{
    private String name="aaa";
    private int age;
    static class C{

    }
    //成员内部类
    class B{
        String name="bbbb";
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.println(name);//ccc
            System.out.println(this.name);//bbb
            System.out.println(P1.this.name);//aaa
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public B() {
        }

        public B(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public void info(){
            show();
        }
    }
    public P1() {
    }

    public P1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void show(){
        System.out.println("外部");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P1 p1 = (P1) o;
        return age == p1.age &&
                Objects.equals(name, p1.name);
    }

    @Override
    public String toString() {
        return "P1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class TestInnerClass {
    public static void main(String[] args) {
        P1.C c=new P1.C();//静态内部类
        //非静态
        P1 p=new P1();
        P1.B b=p.new B();
        b.info();
        b.setName("ccc");
    }
}
