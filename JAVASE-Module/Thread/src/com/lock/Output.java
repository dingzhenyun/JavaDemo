package com.lock;

/**
 * @author DingZhenYun
 * @create 2019-03-17 20:27
 */
public class Output implements  Runnable{
    private Resource r;
    public Output(Resource r){
        this.r=r;
    }

    @Override
    public void run() {
        while(true){
            synchronized (r){
                if(!r.falg){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name+" "+r.sex);
                r.falg=false;
                r.notify();
            }
        }
    }
}
