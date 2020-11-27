package com.day20190216;

/**
 * @author DingZhenYun
 * @create 2019-02-17 20:19
 */
/*
（1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

 */
public class TestAC {
    public static void main(String[] args) {
        Customer c=new Customer("Jane","Smith");
        //Account account=c.getAccount();
        c.setAccount(new Account(1000,2000,0.0123));
        c.getAccount().deposit(100);
        c.getAccount().withdraw(960);
        c.getAccount().deposit(2000);
        System.out.println("Customer ["+c.getLastName()+","+c.getFirstName()+"] has account :id is"+c.getAccount().getId());
    }
}
