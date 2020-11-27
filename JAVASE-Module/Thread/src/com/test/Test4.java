package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-14 10:05
 */
/*
模拟银行取钱的问题
1.定义一个Account类
1）该Account类封装了账户编号（String）和余额（double）两个属性
2）设置相应属性的getter和setter方法
3）提供无参和有两个参数的构造器
4）系统根据账号判断与用户是否匹配，需提供hashCode()和equals()方法的重写
2.提供一个取钱的线程类
1）提供了Account类的account属性和double类的取款额的属性
2）提供带线程名的构造方法
3）run()方法中提供取钱的操作
3.在主类中创建线程进行测试。考虑线程安全问题。

 */
class Accounts{
    private String id;
    private double balance;

    public Accounts(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accounts accounts = (Accounts) o;

        if (Double.compare(accounts.balance, balance) != 0) return false;
        return id.equals(accounts.id);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Accounts() {
    }
}

class T2 implements Runnable{
    Accounts accounts;
    double want;
    public T2(Accounts accounts, double want){
        this.accounts=accounts;
        this.want=want;
    }
    @Override
    public void run() {
        synchronized (this){
            if(accounts.getBalance()>want){
                System.out.println(Thread.currentThread().getName()+ ":取款成功，取现的金额为：" + want);
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                accounts.setBalance(accounts.getBalance()-want);
            }else {
                System.out.println("取现额度超过账户余额，取款失败");}
            System.out.println("现在账户的余额为：" + accounts.getBalance());
        }

        }

}

public class Test4 {
    public static void main(String[] args) {
        Accounts accounts=new Accounts("122",233434);
        T2 t2=new T2(accounts,22);
        T2 t4=new T2(accounts,22222);
        Thread t1=new Thread(t2);
        Thread t3=new Thread(t4);
        t1.start();
        t3.start();
    }
}
