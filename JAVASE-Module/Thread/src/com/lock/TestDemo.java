package com.lock;

/**
 * @author DingZhenYun
 * @create 2019-03-17 19:42
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        Tickets t = new Tickets();
        //创建3个Thread类对象,传递Runnable接口实现类
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t0.start();t1.start();t2.start();
    }
}
