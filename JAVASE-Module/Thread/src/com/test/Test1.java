package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-13 21:47
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 */
class Person implements Runnable{
    int sum=0;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                sum += 1000;
            }
        }
        System.out.println(sum);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person p=new Person();
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        t1.start();
        t2.start();
    }
}
