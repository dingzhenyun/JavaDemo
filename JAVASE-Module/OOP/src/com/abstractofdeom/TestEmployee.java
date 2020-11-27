package com.abstractofdeom;

/**
 * @author DingZhenYun
 * @create 2019-02-20 9:07
 */
/*
编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，
设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问
 */

abstract class Employee{
    private String name;
    private int id;
    private double salary;
    public Employee(){}
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public abstract void work();
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

}

class Manage extends Employee {
    private int bonus;
    public void work(){
        System.out.println("努力");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

class CommonEmployee extends Employee {
    @Override
    public void work() {

        System.out.println("dd");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e=new CommonEmployee();
        e.work();
        Employee e1=new Manage();
        e1.work();
    }
}
