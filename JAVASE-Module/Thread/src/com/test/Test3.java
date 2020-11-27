package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-13 22:26
 * 使用两个线程打印 1-100. 线程1, 线程2 交替打印
 */
//线程通信
class T1 implements Runnable{
    int i=1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();//唤醒锁
                if(i<=100) {
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ +i);
                    i++;
                }
                else
                    break;
                try {
                    wait();//释放当前锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        T1 t1=new T1();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t1);
        thread1.setName("one");
        thread2.setName("two");
        thread1.start();
        thread2.start();
    }
}
