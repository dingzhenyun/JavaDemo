package day20190315.doaim;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author DingZhenYun
 * @create 2019-03-16 10:57
 */
interface Human{
    void info();
    void fly();
}
//被代理类
class Superman implements Human{
    @Override
    public void info() {
        System.out.println("我是超人！我怕谁！");
    }
    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
class HumanUtil{
    public void method1() {
        System.out.println("=======方法一=======");
    }

    public void method2() {
        System.out.println("=======方法二=======");
    }
}
class MyInvocationHandler1 implements InvocationHandler{
    Object obj;// 被代理类对象的声明
    public void setObject(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil h=new HumanUtil();
        h.method1();
        Object returnVal=method.invoke(obj,args);
        h.method2();
        return returnVal;
    }
}
class MyProxy{
    // 动态的创建一个代理类的对象
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler1 handler=new MyInvocationHandler1();
        handler.setObject(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
public class TestAOP {
    public static void main(String[] args) {
        Superman sm=new Superman();
        Object obj=MyProxy.getProxyInstance(sm);
        Human hu=(Human)obj;
        hu.info();
        System.out.println();
        hu.fly();

        NickClothFactory nick=new NickClothFactory();
        Object obj1=MyProxy.getProxyInstance(nick);
        ClothFactory clothFactory=(ClothFactory)obj1;
        clothFactory.productCloth();
    }
}
