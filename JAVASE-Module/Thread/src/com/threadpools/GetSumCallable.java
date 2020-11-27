package com.threadpools;

import java.util.concurrent.Callable;

/**
 * @author DingZhenYun
 * @create 2019-03-17 19:21
 */
public class GetSumCallable implements Callable<Integer> {
    private int a;
    public GetSumCallable(int a){
        this.a=a;
    }
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
}
