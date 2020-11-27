package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 12:04
 */
class Ticket extends Thread{
    static  int t=100;
    static Object obj=new Object();
    @Override
    public void run() {
        while(true){
            //synchronized (this) {//此时this代表三个对象,锁要唯一
            synchronized (obj){
                if (t > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + t--);
                }
            }
        }
    }
}

public class TestThreads3 {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
