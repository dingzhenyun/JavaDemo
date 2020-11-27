package cn.ecut.dzy.now;/**
 * @author DingZhenYun
 * @create 2020-11-27 上午 10:51
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: JavaDemo->TestClone
 * @description: 测试引用类型的深拷贝
 * putAll()只是对基本数据类型作了深拷贝。
 * 对于引用类型，使用序列化的方式来实现对象的深拷贝，前提是，对象必须是实现了Serializable接口才可以，
 * Map本身没有实现 Serializable 这个接口，所以这种方式不能序列化Map，也就是不能深拷贝Map。
 * 但是HashMap是可以的，因为它实现了 Serializable。下面的方式，基于HashMap来讲，非Map的拷贝。
 **/
public class TestClone {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(100);
            list.add(200);
            HashMap<String,Object> map = new HashMap<String,Object>();
            //放基本类型数据
            map.put("basic", 100);
            //放对象
            map.put("list", list);
            HashMap<String,Object> mapNew = new HashMap<String,Object>();
            mapNew.putAll(map);
            System.out.println("----数据展示-----");
            System.out.println(map);
            System.out.println(mapNew);
            System.out.println("----更改基本类型数据-----");
            map.put("basic", 200);
            System.out.println(map);
            System.out.println(mapNew);
            System.out.println("----更改引用类型数据-----");
            list.add(300);
            System.out.println(map);
            System.out.println(mapNew);
            System.out.println("----使用序列化进行深拷贝-----");
            mapNew = TestClone.myClone(map);
            list.add(400);
            System.out.println(map);
            System.out.println(mapNew);
        }
        @SuppressWarnings("unchecked")
        public static <T extends Serializable> T myClone(T obj){
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
    }
