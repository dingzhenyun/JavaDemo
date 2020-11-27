package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 12:10
 */
//创建多线程的方式二
class Tt implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
                System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"--"+i);
        }
    }
}

public class TestThreads4 {
    public static void main(String[] args) {
        Tt t1=new Tt();
        //1
        Thread t=new Thread(t1);
        t.start();
        //2
        Thread t2=new Thread(t1);
        t2.start();//启动线程，执行Thread对象生成时构造器形参的对象的RUN()
    }
}
