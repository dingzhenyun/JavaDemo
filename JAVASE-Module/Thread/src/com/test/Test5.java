package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-14 12:59
 */
class Mythread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=50;i++){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}

class Myruabble implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=50;i++){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        Myruabble myruabble=new Myruabble();
        Thread t1=new Thread(myruabble);
        t1.setName("乙");
        mythread.setName("甲");
        t1.start();
        mythread.start();
        for(int i=0;i<=50;i++) {

            if (i == 20) {
                try {
                    mythread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
