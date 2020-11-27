package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-13 21:52
 */


/**
 * @author DingZhenYun
 * @create 2019-03-13 21:47
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 */
class Account{
    int balance;
    public Account(){}
    public synchronized void save(int amt){
        notify();
        balance+=amt;
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" "+balance);
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Person1 extends Thread{
    Account account;
    public Person1(Account account){
        this.account=account;
    }
    @Override
    public void run() {
            for (int i = 1; i <= 3; i++) {
                account.save(1000);
            }

    }
}

public class Test2 {
    public static void main(String[] args) {
        Account account=new Account();
        Person1 t1=new Person1(account);
        Person1 t2=new Person1(account);
        t1.setName("one");
        t1.setName("two");
        t1.start();
        t2.start();
    }
}

