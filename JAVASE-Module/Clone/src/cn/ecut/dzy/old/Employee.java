package cn.ecut.dzy.old;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
    private String name;
    private int age;

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("姓名："+name+"\n");
        sb.append("年龄："+age+"\n");
        return sb.toString();

    }
    public Employee clone(){
        Employee ee=null;
        try{
            ee=(Employee)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ee;
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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
