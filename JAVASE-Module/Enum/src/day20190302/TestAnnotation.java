package day20190302;

/**
 * @author DingZhenYun
 * @create 2019-03-02 13:22
 */
//1注解
//@Override: 限定重写父类方法, 该注释只能用于方法
//@Deprecated: 用于表示某个程序元素(类, 方法等)已过时
//@SuppressWarnings: 抑制编译器警告
    //2自定义注解

@interface MyAnotation{
    String values();
}

//3元注解
public class TestAnnotation {
    public static void main(String[] args) {

    }
}
