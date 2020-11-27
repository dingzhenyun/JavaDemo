package day20190315.doaim;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author DingZhenYun
 * @create 2019-03-16 8:49
 */
//动态代理的使用，体会反射是动态语言的关键
interface Subject{
    void action();
}
// 被代理类
class RealSubject implements Subject{

    @Override
    public void action() {
        System.out.println("我是被代理类");
    }
}
class MyInvocationHandler implements InvocationHandler{
    Object obj;// 实现了接口的被代理类的对象的声明
    public Object blind(Object obj){
        this.obj=obj;
        // ①给被代理的对象实例化②返回一个代理类的对象
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }
    //当通过代理类的对象发起对被重写的方法的调用时，都会转换为对如下的invoke方法的调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method方法的返回值时returnVal
        Object returnVal=method.invoke(obj,args);
        return returnVal;
    }
}
public class Test {
    public static void main(String[] args) {
        //1.被代理类的对象
        RealSubject rs=new RealSubject();
        //2.创建一个实现了InvacationHandler接口的类的对象
        MyInvocationHandler handler=new MyInvocationHandler();
        //3.调用blind()方法，动态的返回一个同样实现了real所在类实现的接口Subject的代理类的对象。
        Object obj=handler.blind(rs);
        Subject sub=(Subject)obj;//此时sub就是代理类的对象
        sub.action();//转到对InvacationHandler接口的实现类的invoke()方法的调用

        //例子
        NickClothFactory nickClothFactory=new NickClothFactory();
        ClothFactory cf=(ClothFactory) handler.blind(nickClothFactory);
        cf.productCloth();
    }
}
