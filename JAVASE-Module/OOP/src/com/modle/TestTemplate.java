package com.modle;

/**
 * @author DingZhenYun
 * @create 2019-02-20 14:01
 */
/*
        抽象类体现的就是一种模板模式的设计，抽象类作为多个子类的通用模板，
        子类在抽象类的基础上进行扩展、改造，但子类总体上会保留抽象类的行为方式。
解决的问题：
当功能内部一部分实现是确定，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。
编写一个抽象父类，父类提供了多个子类的通用方法，并把一个或多个方法留给其子类实现，就是一种模板模式。

 */
abstract class Template{
    abstract void code();
    public void testTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println("时间为"+(end-start));
    }
}

class SubTemplate extends Template {


    @Override
    void code() {
        boolean b=false;
        for(int i=2;i<=1000000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    b=true;
                    break;
                }
            }
            if(!b){
                System.out.println(i);
            }
            b=false;
        }
    }
}

public class TestTemplate {
    public static void main(String[] args) {
        new SubTemplate().testTime();
    }
}
