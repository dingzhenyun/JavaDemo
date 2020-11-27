package com.day20190223pm;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author DingZhenYun
 * @create 2019-02-24 9:59
 */
/*
1. 定义一个Employee类，
该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
并为每一个属性定义 getter, setter 方法；
并重写 toString 方法输出 name, age, birthday

MyDate类包含:
private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；

创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
分别按以下两种方式对集合中的元素进行排序，并遍历输出：

1). 使Employee 实现 Comparable 接口，并按 name 排序
2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。

提示：Employee类是否需要重写equals()方法？MyDate类呢？

 */
class MyDate1{
    private int year;
    private int months;
    private int days;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate1 myDate1 = (MyDate1) o;
        return year == myDate1.year &&
                months == myDate1.months &&
                days == myDate1.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, months, days);
    }

    @Override
    public String toString() {
        return "MyDate1{" +
                "year=" + year +
                ", months=" + months +
                ", days=" + days +
                '}';
    }



    public MyDate1(int year, int months, int days) {
        this.year = year;
        this.months = months;
        this.days = days;
    }

    public MyDate1() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

class Employees1 {
    private String name;
    private Integer age;
    private MyDate1 birthday;

    public Employees1() {
    }

    public Employees1(String name, Integer age, MyDate1 birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MyDate1 getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate1 birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employees1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees1 that = (Employees1) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}

public class TestTreeSet3 {
    public static void main(String[] args) {
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employees1 && o2 instanceof Employees1){
                    Employees1 e1=(Employees1)o1;
                    Employees1 e2=(Employees1)o2;
                    MyDate1 b1=e1.getBirthday();
                    MyDate1 b2=e2.getBirthday();
                    if(b1.getYear()!=b2.getYear()){
                        return b1.getYear()-b2.getYear();
                    }
                    else{
                        if(b1.getMonths()!=b2.getMonths()){
                            return b1.getMonths()-b2.getMonths();
                        }else{
                            return b1.getDays()-b2.getDays();
                        }
                    }

                }
                return 0;
            }
        };
        TreeSet ts=new TreeSet(comparator);
        ts.add(new Employees1("AA",23,new MyDate1(1993,2,34)));
        ts.add(new Employees1("bb",22,new MyDate1(1933,2,14)));
        ts.add(new Employees1("dd",21,new MyDate1(1993,12,4)));
        ts.add(new Employees1("WW",25,new MyDate1(1993,5,23)));
        ts.add(new Employees1("AA",23,new MyDate1(1993,7,25)));
        ts.add(new Employees1("MM",20,new MyDate1(1993,9,11)));
        Iterator iterator=ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
