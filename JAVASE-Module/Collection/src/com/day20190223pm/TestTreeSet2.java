package com.day20190223pm;

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
class MyDate{
    private int year;
    private int months;
    private int days;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", months=" + months +
                ", days=" + days +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                months == myDate.months &&
                days == myDate.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, months, days);
    }

    public MyDate(int year, int months, int days) {
        this.year = year;
        this.months = months;
        this.days = days;
    }

    public MyDate() {
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

class Employees implements Comparable{
    private String name;
    private Integer age;
    private MyDate birthday;

    public Employees() {
    }

    public Employees(String name, Integer age, MyDate birthday) {
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(name, employees.name) &&
                Objects.equals(age, employees.age) &&
                Objects.equals(birthday, employees.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employees){
            Employees e=(Employees)o;
            return this.getName().compareTo((e.getName()));
        }else
            return 0;
    }
}

public class TestTreeSet2 {
    public static void main(String[] args) {
        T1();
        System.out.println();
    }

    private static void T1() {
        TreeSet<Employees> ts=new TreeSet<>();
        ts.add(new Employees("AA",23,new MyDate(1993,2,34)));
        ts.add(new Employees("bb",22,new MyDate(1993,2,34)));
        ts.add(new Employees("dd",21,new MyDate(1993,2,34)));
        ts.add(new Employees("WW",25,new MyDate(1993,2,34)));
        ts.add(new Employees("AA",23,new MyDate(1993,2,34)));
        ts.add(new Employees("MM",20,new MyDate(1993,2,34)));
        Iterator<Employees> iterator=ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
