package com.com.duotai;

/**
 * @author DingZhenYun
 * @create 2019-02-18 12:14
 */
public class Test {
    public static void main(String[] args) {
        Test t=new Test();
        t.method(new Student());
    }
    public void method(Person p){
        System.out.println(p.getInfo());
        if(p instanceof Graduate){
            System.out.println(" a graduate");
        }
        if(p instanceof Student){
            System.out.println("a Student");
        }
        if(p instanceof Person){
            System.out.println("a person");
        }
    }
}

class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}

class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}

class Graduate extends Student {
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}

