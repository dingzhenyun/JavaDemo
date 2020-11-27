package day20190315.reflection;

import java.lang.reflect.Constructor;

/**
 * @author DingZhenYun
 * @create 2019-03-15 15:27
 */
public class TestContruction {
    public static void main(String[] args) throws Exception {
        //创建对应的运行时类的对象。使用newInstance()，实际上就是调用了运行时类的空参的构造器。
        //要想能够创建成功：①要求对应的运行时类要有空参的构造器。②构造器的权限修饰符的权限要足够。
        String className="com.day20190315.reflection.Person";
        Class clazz=Class.forName(className);
        Object obj=clazz.newInstance();
        Person p=(Person)obj;
        System.out.println(p);
        System.out.println();
        Constructor []constructor=clazz.getDeclaredConstructors();
        for(Constructor c:constructor){
            System.out.println(c);
        }
        t1();
    }

    private static void t1() throws Exception {
        //调用指定的构造器,创建运行时类的对象
        String className="com.day20190315.reflection.Person";
        Class clazz=Class.forName(className);
        Constructor constructor=clazz.getDeclaredConstructor(int.class,String.class);
        constructor.setAccessible(true);
        Person p=(Person)constructor.newInstance(12,"dss");
        System.out.println(p);
    }
}
