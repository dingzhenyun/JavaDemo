package day20190315.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author DingZhenYun
 * @create 2019-03-15 15:46
 */
public class TestFileds {
    public static void main(String[] args) throws Exception {
    //t1();
    //t2();
    t3();
    }

    private static void t3() throws Exception{
        //调用运行时类中指定的属性
        Class clazz=Person.class;
        //1.获取指定的属性
        //getField(String fieldName):获取运行时类中声明为public的指定属性名为fieldName的属性
        Field id=clazz.getField("id");

        //2.创建运行时类的对象
        Person p=(Person)clazz.newInstance();
        //3.将运行时类的指定的属性赋值
        id.set(p,12);
        System.out.println(p);

        //getDeclaredField(String fieldName):获取运行时类中指定的名为fieldName的属性
        Field name=clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"fff");
        System.out.println("%"+name.get(p));
        Field age=clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,23);
        System.out.println(p);
        System.out.println(age.get(p));
        //由于属性权限修饰符的限制，为了保证可以给属性赋值，需要在操作前使得此属性可被操作。
        //调用静态属性
        Field s=clazz.getDeclaredField("aaa");
        System.out.println(s.get(p));
        System.out.println(s.get(Person.class));
        System.out.println(s.get(null));
    }

    private static void t2() {
        //权限修饰符  变量类型 变量名
        //获取属性的各个部分的内容
        Class clazz=Person.class;
        //1.获取每个属性的权限修饰符
        Field [] fields1=clazz.getDeclaredFields();
        for(Field f:fields1){
            //1.获取每个属性的权限修饰符
            int i=f.getModifiers();
            String str= Modifier.toString(i);
            System.out.print(str+" ");
            //2.获取属性的类型
           Class c= f.getType();
            System.out.print(c.getName()+" ");
            //3.获取属性名
            System.out.print(f.getName());
            System.out.println();
        }

    }

    private static void t1() {
        //获取对应的运行时类的属性
        Class clazz=Person.class;
        //1.getFields():只能获取到运行时类中及其父类中声明为public的属性
        Field [] fields=clazz.getFields();
        for (Field f:fields) {
            System.out.println(f);
        }
        System.out.println();
        //2.getDeclaredFields():获取运行时类本身声明的所有的属性
        Field [] fields1=clazz.getDeclaredFields();
        for(Field f:fields1){
            System.out.println(f.getName());
        }
    }
}
