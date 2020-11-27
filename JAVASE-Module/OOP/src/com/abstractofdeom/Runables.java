package com.abstractofdeom;

/**
 * @author DingZhenYun
 * @create 2019-02-20 14:25
 */
interface Runner{
    void stop();
    void start();
    void run();
}

class Person implements Runner {

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}

public class Runables {
    public static void main(String[] args) {
        new Person().run();
    }
}
