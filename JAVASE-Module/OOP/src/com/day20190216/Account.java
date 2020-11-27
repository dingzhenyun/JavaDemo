package com.day20190216;

/**
 * @author DingZhenYun
 * @create 2019-02-17 17:56
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.annualInterestRate=annualInterestRate;
        this.balance=balance;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId( int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public void withdraw (double amount){
        if(amount>balance)
            System.out.println("余额不足");
        else
            balance-=amount;
    }
    public void deposit (double amount){
        balance+=amount;
    }

}
