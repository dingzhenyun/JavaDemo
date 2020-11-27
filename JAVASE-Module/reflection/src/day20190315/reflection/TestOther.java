package day20190315.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author DingZhenYun
 * @create 2019-03-15 16:47
 */
public class TestOther {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
        t4();
        t5();
        t6();
    }
    private static void t3() {
        //3*.获取父类的泛型
        Class clazz=Person.class;
        Type type=clazz.getGenericSuperclass();
        ParameterizedType p=(ParameterizedType)type;
        Type [] ars=p.getActualTypeArguments();
        System.out.println(((Class)ars[0]).getName());

    }
    private static void t4() {

        //4.获取实现的接口
        Class clazz=Person.class;
        Class []d=clazz.getInterfaces();
        for(Class i:d){
            System.out.println(i);
        }
    }
    private static void t5() {
        //5.获取所在的包
        Class clazz=Person.class;
        Package p=clazz.getPackage();
        System.out.println(p);
    }
    private static void t6() {
        //6.获取注解
        Class clazz=Person.class;
        Annotation [] annotations=clazz.getAnnotations();
       for(Annotation a:annotations){
           System.out.println(a);
       }
    }
    private static void t2() {
        //2.获取带泛型的父类
        Class clazz=Person.class;
        Type t=clazz.getGenericSuperclass();
        System.out.println(t);
    }

    private static void t1() {
        //1.获取运行时类的父类
        Class clazz=Person.class;
        Class c=clazz.getSuperclass();
        System.out.println(c);
    }
}
