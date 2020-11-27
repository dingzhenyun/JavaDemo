package com.day20190216;
//值传递
/**
 * @author DingZhenYun
 * @create 2019-02-17 10:14
 */

public class ValueTel {
    public static void main(String[] args) {
        int k=1;
        int m=33;
        ValueTel t=new ValueTel();
        System.out.println("k="+k+"\t"+"m="+m);
        t.swap(k,m);
        System.out.println("k="+k+" "+"m="+m);
    }
    public void swap(int n,int m){
        int t=n;
        n=m;
        m=t;
        System.out.println("n="+n+" "+"m="+m);
    }

}
