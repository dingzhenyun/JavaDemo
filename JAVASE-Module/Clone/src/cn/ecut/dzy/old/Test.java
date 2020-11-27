package cn.ecut.dzy.old;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
浅克隆，针对基本类型、引用类型不变的String
 */
public class Test {
    public static void main(String [] args){
        System.out.println("克隆之前：");
        System.out.println("序列化之前：");
        Address address=new Address("中国","江西","赣州");
        People1 p1=new People1(30,"sdd",address);
        System.out.println("原先：");
        System.out.println(p1);
        System.out.println("后：");
        ObjectOutputStream out=null;
        ObjectInputStream  in=null;
        People1 p=null;
        try{
            out=new ObjectOutputStream(new FileOutputStream("dd.dat"));
            out.writeObject(p1);
            in=new ObjectInputStream(new FileInputStream("dd.dat"));
            p=(People1)in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        if(p!=null){
            p.getAddress().setState("美国");
            p.getAddress().setProvince("cc");
            p.getAddress().setCity("纽约");
            p.setAge(8888);
            p.setName("凡大教授");
            System.out.println("p1：");
            System.out.println(p1);
            System.out.println("p2：");
            System.out.println(p);
        }


    }
}
