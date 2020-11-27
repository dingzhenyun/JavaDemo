package day20190315.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * @author DingZhenYun
 * @create 2019-03-15 16:04
 */
public class TestMethod {
    public static void main(String[] args) throws Exception {
   // t1();
    //t2();
    t3();
    }

    private static void t3() throws Exception {
        //调用运行时类中指定的方法 **
        Class clazz=Person.class;
        //getMethod(String methodName,Class ... params):获取运行时类中声明为public的指定的方法
        Method m1=clazz.getMethod("show");
        Person p=(Person)clazz.newInstance();
        //调用指定的方法：Object invoke(Object obj,Object ... obj)
        Object objectVal=m1.invoke(p);//我是一个人
        System.out.println(objectVal);//null

        Method m2=clazz.getMethod("toString");
        Object o=m2.invoke(p);
        System.out.println(o);//Person{id=0, name='null', age=0}

        //对于运行时类中静态方法的调用
        Method m3=clazz.getMethod("ss");
        Object o3=m3.invoke(Person.class);
        System.out.println(o3);
        //getDeclaredMethod(String methodName,Class ... params):获取运行时类中声明了的指定的方法
        Method m4=clazz.getDeclaredMethod("display", String.class, Integer.class);
        m4.setAccessible(true);
        Object o4=m4.invoke(p,"Sss",23);
        System.out.println(o4);
    }

    private static void t2() {
        //注解 权限修饰符 返回值类型 方法名 形参列表 异常
        Class clazz=Person.class;
        Method [] mm=clazz.getDeclaredMethods();
        for(Method m2:mm){
            //1.注解
            Annotation[] ann =m2.getAnnotations();
            for(Annotation ann1:ann){
                System.out.println(ann1);
            }
            //2.权限修饰符
            String str=Modifier.toString(m2.getModifiers());
            System.out.print(str+" ");
            //3.返回值类型
            Class returnType=m2.getReturnType();
            System.out.print(returnType.getName()+" ");
            //4.方法名
            System.out.print(m2.getName()+" ");
            //5.形参列表
            System.out.print("(");
            Class [] param=m2.getParameterTypes();
            for(int i=0;i<param.length;i++){
                System.out.print(param[i].getName()+"-args-"+i+" ");
            }
            System.out.print(")");
            //6.异常类型
            Class [] classes=m2.getExceptionTypes();
            if(classes.length!=0){
                System.out.print("throws ");
            }
            for (Class c:classes) {
                System.out.print(c.getName()+" ");
            }
            System.out.println();
        }
    }

    private static void t1() {
        //1.获取运行时类的方法
        Class clazz=Person.class;
        //1.getMethods():获取运行时类及其父类中所有的声明为public的方法
        Method[] m=clazz.getMethods();
        for(Method m1:m){
            System.out.println(m1);
        }
        System.out.println();

        //2.getDeclaredMethods():获取运行时类本身声明的所有的方法
        Method [] mm=clazz.getDeclaredMethods();
        for(Method m2:mm){
            System.out.println(m2);
        }
    }
}
