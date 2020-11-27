package com.day20190313;

/**
 * @author DingZhenYun
 * @create 2019-03-13 10:15
 */

//1.创建继承于Thread的子类
class SubThread extends Thread{
    //重写Run()
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getPriority()+i);
        }
    }
}

public class TestThresds1 {
    public static void main(String[] args) {
        //创建子类对象
        SubThread subThread=new SubThread();
        //调用线程方法,start只能调用一次
        subThread.start();//启动线程，调用run（）
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getPriority()+i);
        }
    }
}
