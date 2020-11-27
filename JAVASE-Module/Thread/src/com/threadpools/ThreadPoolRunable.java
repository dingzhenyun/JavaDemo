package com.threadpools;

/**
 * @author DingZhenYun
 * @create 2019-03-17 19:02
 */
public class ThreadPoolRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程提交任务");
    }
}
