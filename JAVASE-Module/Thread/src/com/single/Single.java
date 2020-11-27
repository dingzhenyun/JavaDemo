package com.single;

/**
 * @author DingZhenYun
 * @create 2019-03-13 21:27
 */
//懒汉式优化:采用线程同步
//对于一般方法，使用同步代码块，考虑使用this
//对于静态方法，使用当前类本身充当锁
class Singleton{
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
        synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton();
        }
        }
        return instance;
    }
}

public class Single {
    public static void main(String[] args) {
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
