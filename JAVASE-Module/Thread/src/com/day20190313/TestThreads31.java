package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 12:04
 */
class Ticket31 implements Runnable{
    int t=100;
    Object obj=new Object();
    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (this) {
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

public class TestThreads31 {
    public static void main(String[] args) {
        Ticket31 t1=new Ticket31();
        Thread thread1=new Thread(t1);
        thread1.setName("窗口1");
        Thread thread2=new Thread(t1);
        thread2.setName("窗口2");
        Thread thread3=new Thread(t1);
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
