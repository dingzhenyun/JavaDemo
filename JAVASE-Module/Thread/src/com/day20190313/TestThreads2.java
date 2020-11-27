package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 10:29
 */
class T1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"--"+i);
        }
    }
}

class T2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2!=0)
                System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"--"+i);
        }
    }
}

public class TestThreads2 {
    public static void main(String[] args) {
        T1 t1=new T1();
        t1.setPriority(Thread.MAX_PRIORITY);
        T2 t2=new T2();
        t1.start();
        t2.start();
        new Thread(){
            public void run() {
                for(int i=0;i<=100;i++){
                        System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"--"+i);
                }
            }
        }.start();
    }
}
