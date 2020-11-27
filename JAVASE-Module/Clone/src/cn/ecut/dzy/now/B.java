package cn.ecut.dzy.now;/**
 * @author DingZhenYun
 * @create 2020-05-14 下午 13:33
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: A->B深拷贝
 * @description:putAll()只是对基本数据类型作了深拷贝。
 * 对于引用类型，使用序列化的方式来实现对象的深拷贝，前提是，
 * 对象必须是实现了Serializable接口才可以，Map本身没有实现 Serializable 这个接口，
 * 所以这种方式不能序列化Map，也就是不能深拷贝Map。但是HashMap是可以的
 * 因为它实现了 Serializable。下面的方式，基于HashMap来讲，非Map的拷贝。
 **/
public class B {
    public static void main(String[] args) {
        Map<String, List<Teller>> mapa=new HashMap<>();
        Map<String, List<Teller>> mapb=new HashMap<>();
        Teller teller=new Teller();
        teller.setA("a");
        teller.setB("b");
        teller.setC("c");
        List<Teller> list=new ArrayList<>();
        list.add(teller);
        mapa.put("test",list);
        System.out.println("mapa"+mapa);
        System.out.println("mapb"+mapb);

        B b=new B();
         mapb=b.clone2(mapa);
        System.out.println("mapa-------------"+mapa);
        System.out.println("mapb-----------"+mapb);
        System.out.println(mapa.equals(mapb));
        list.clear();
        System.out.println("mapa----------修改---"+mapa);
        System.out.println("mapb----------修改-"+mapb);
        System.out.println(mapa.equals(mapb));

    }



    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone1(T obj){
        T clonedObj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedObj = (T) ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clonedObj;
    }

    @SuppressWarnings("unchecked")
    public static  Map<String, List<Teller>> clone2( Map<String, List<Teller>> obj){
        Map<String, List<Teller>>clonedObj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedObj = (Map<String, List<Teller>>) ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clonedObj;
    }
}
