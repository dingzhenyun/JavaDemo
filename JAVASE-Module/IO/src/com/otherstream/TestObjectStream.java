package com.otherstream;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 15:21
 */
//实现序列化接口
    //1类是可序列化的，实现接口
    //2类的属性同样实现接口
    //3 private static final long serialVersionUID
    //ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量
class Person implements Serializable {
    private static final long serialVersionUID = 1027075219760021298L;
    private String naem;
    private Integer id;

    @Override
    public String toString() {
        return "Person{" +
                "naem='" + naem + '\'' +
                ", id=" + id +
                '}';
    }

    public Person(String naem, Integer id) {
        this.naem = naem;
        this.id = id;
    }

    public Person() {
    }
}

public class TestObjectStream {
    public static void main(String[] args) {
        t1();
        t2();
    }

    private static void t2() {
        //反序列化：将硬盘的文件通过ObjectInputStream转为相应的对象
        ObjectInputStream objectInputStream= null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("IO/VVV.txt"));
            Person p1=(Person)objectInputStream.readObject();
            System.out.println(p1);
            Person p2=(Person)objectInputStream.readObject();
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void t1() {
        //对象的序列化：将内存的对象通过 ObjectOutputStream转换为二进制流，存储在硬盘
        ObjectOutputStream objectOutputStream= null;
        try {
            Person p1=new Person("dd",23);
            Person p2=new Person("3dd",23);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("IO/VVV.txt"));
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
