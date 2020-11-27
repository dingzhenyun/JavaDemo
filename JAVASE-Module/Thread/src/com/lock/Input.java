package com.lock;

/**
 * @author DingZhenYun
 * @create 2019-03-17 20:27
 */
public class Input implements Runnable{
    private  Resource r;
    public Input(Resource r){
        this.r=r;
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            synchronized (r){
                if(r.falg){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(i%2==0){
                    r.name="掌声";
                    r.sex="男";
                }else{
                    r.name="ff";
                    r.sex="女";
                }
                r.falg=true;
                r.notify();

            }
            i++;
        }
    }
}
