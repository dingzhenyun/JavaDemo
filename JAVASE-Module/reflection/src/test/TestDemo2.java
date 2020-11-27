package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author DingZhenYun
 * @create 2019-03-22 21:09
 * 2.用反射去创建一个对象，有2种方式，尽量用代码去体现
 */
class Student{
    private int id;
    private String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestDemo2 {
    public static void main(String[] args) throws Exception {
        //获取Student类的字节码对象
        Class clazz=Class.forName("test.Student");
        //1
        Student student= (Student) clazz.newInstance();
        System.out.println(student);
        Constructor constructor=clazz.getConstructor(int.class,String.class);
        Method method=clazz.getMethod("setId",int.class);
        method.invoke(student,22);
        System.out.println(student);
        Student student1= (Student) constructor.newInstance(30,"dd");
        System.out.println(student1);
    }
}
