package test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author DingZhenYun
 * @create 2019-03-22 21:06
 * .ArrayList<Integer> list = new ArrayList<Integer>();
 * 	这个泛型为Integer的ArrayList中存放一个String类型的对象
 *
 */

public class TestDemo1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        System.out.println(list);
        Class clazz=Class.forName("java.util.ArrayList");
        Method method=clazz.getMethod("add",Object.class);
        method.invoke(list,"ddddd");
        System.out.println(list);
    }
}
