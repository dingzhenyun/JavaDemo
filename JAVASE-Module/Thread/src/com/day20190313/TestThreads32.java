package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 12:04
 */
//同步方法
class Ticket22 implements Runnable{
    int t=100;
    @Override
    public void run() {
        while(true){
               show();
        }
    }
    public synchronized void show(){//锁是this
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

public class TestThreads32 {
    public static void main(String[] args) {
        Ticket22 t22=new Ticket22();
        Thread t1=new Thread(t22);
        Thread t2=new Thread(t22);
        Thread t3=new Thread(t22);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
