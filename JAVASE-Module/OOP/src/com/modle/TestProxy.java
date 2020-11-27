package com.modle;
//代理模式


/**
 * @author DingZhenYun
 * @create 2019-02-20 20:44
 */
interface Object{
    void action();
}

//代理类
class ProxyObject implements Object {
    Object obj;
    public ProxyObject(){
        System.out.println("代理类创建成功");
        obj=new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("代理类开始执行");
        obj.action();
        System.out.println("代理类执行结束");
    }
}

class ObjectImpl implements Object {


    @Override
    public void action() {
        System.out.println("被代理类开始执行");
        System.out.println("被代理类执行结束");
    }
}

public class TestProxy {
    public static void main(String[] args) {
        Object obj=new ProxyObject();
        obj.action();
    }
}
