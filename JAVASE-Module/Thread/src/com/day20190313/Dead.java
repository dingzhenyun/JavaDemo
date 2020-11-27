package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 22:14
 */
//死锁
public class Dead {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb1){
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sb1.append('A');
                    synchronized (sb2){
                        sb2.append('C');
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb2){
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sb1.append('B');
                    synchronized (sb1){
                        sb2.append('D');
                    }
                }
            }
        }.start();
    }
}
