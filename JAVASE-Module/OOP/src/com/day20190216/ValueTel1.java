package com.day20190216;

/**
 * @author DingZhenYun
 * @create 2019-02-17 10:19
 */
class D{
    int i=2;
    int j=9;
}

public class ValueTel1 {
    public static void main(String[] args) {
        ValueTel1 t=new ValueTel1();
        D d=new D();
        System.out.println("d.i"+d.i+" "+"d.j="+d.j);
        t.swap(d);
        System.out.println("d.i"+d.i+" "+"d.j="+d.j);
    }
    public void swap(D d){
        int t=d.i;
        d.i=d.j;
        d.j=t;
        System.out.println("d.i"+d.i+" "+"d.j="+d.j);
    }

}
