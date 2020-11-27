package day20190315.reflection;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author DingZhenYun
 * @create 2019-03-15 14:18
 */

public class Relfection1 {
    public static void main(String[] args) throws Exception {
        Relfection1 r=new Relfection1();
        t1();
        t2();
        r.t3();
        r.t4();
    }

    private void t4() throws ClassNotFoundException, IOException {
        ////关于类的加载器：ClassLoader
        ClassLoader classLoader1=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);

        ClassLoader classLoader2=classLoader1.getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3=classLoader2.getParent();
        System.out.println(classLoader3);

        Class clazz1=Person.class;
        ClassLoader classLoader4=clazz1.getClassLoader();
        System.out.println(classLoader4);

        String className="java.lang.Object";
        Class clazz2=Class.forName(className);
        ClassLoader classLoader5=clazz2.getClassLoader();
        System.out.println(classLoader5);
        //掌握如下
        ClassLoader loader=this.getClass().getClassLoader();
        InputStream is=loader.getResourceAsStream("com/day20190315/reflection/jdbc1.properties");
        //FileInputStream is=new FileInputStream(new File("E:\\Demo\\reflection\\src\\jdbc2.properties"));
        Properties p=new Properties();
        p.load(is);
        String name=p.getProperty("user");
        System.out.println(name);
    }

    private void t3() throws ClassNotFoundException {
        //如何获取Class的实例（3种）
        //1.调用运行时类本身的.class属性
        Class clazz=Person.class;
        System.out.println(clazz.getName());
        Class clazz1=String.class;
        System.out.println( clazz1.getName());
        //2.通过运行时类的对象获取
        Person p=new Person();
        Class clazz2=p.getClass();
        System.out.println(clazz2.getName());
        //3.通过Class的静态方法获取.通过此方式，体会一下，反射的动态性。
        String className="com.day20190315.reflection.Person";
        Class clazz4=Class.forName(className);

        System.out.println(clazz4.getName());
        //4.（了解）通过类的加载器
        ClassLoader classLoader=this.getClass().getClassLoader();
        Class clazz5=classLoader.loadClass(className);
        System.out.println(clazz5.getName());
        System.out.println(clazz==clazz2);
    }

    private static void t2() {
        /*
         * java.lang.Class:是反射的源头。
         * 我们创建了一个类，通过编译（javac.exe）,生成对应的.class文件。之后我们使用java.exe加载（JVM的类加载器完成的）
         * 此.class文件，此.class文件加载到内存以后，就是一个运行时类，存在在缓存区。那么这个运行时类本身就是一个Class的实例！
         * 1.每一个运行时类只加载一次！
         * 2.有了Class的实例以后，我们才可以进行如下的操作：
         *     1）*创建对应的运行时类的对象
         *     2）获取对应的运行时类的完整结构（属性、方法、构造器、内部类、父类、所在的包、异常、注解、...）
         *     3）*调用对应的运行时类的指定的结构(属性、方法、构造器)
         *     4）反射的应用：动态代理
         */
        Person p=new Person();
        Class class1=p.getClass();
        System.out.println(class1);
    }

    private static void t1() throws Exception {
        //有了反射，可以通过反射创建一个类的对象，并调用其中的结构
        Class<Person> clazz=Person.class;
        //1.创建clazz对应的运行时类Person类的对象
        Person p=clazz.newInstance();
        //2.通过反射调用运行时类的指定的属性
        //2.1 public
        Field f1=clazz.getField("id");
        f1.set(p,11);
        System.out.println(p);
        //2 private
        Field f2=clazz.getDeclaredField("name");
        f2.setAccessible(true);
        f2.set(p,"AA");
        System.out.println(p);
        //3.通过反射调用运行时类的指定的方法
        Method m1=clazz.getMethod("show");
        m1.invoke(p);
        Method m2=clazz.getMethod("display",String.class);
        m2.invoke(p,"CHN");
    }

}
