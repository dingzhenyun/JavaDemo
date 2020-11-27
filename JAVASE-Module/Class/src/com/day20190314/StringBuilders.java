package com.day20190314;

/**
 * @author DingZhenYun
 * @create 2019-03-15 9:11
 * java.lang.StringBuffer：可变的字符序列
 *  * java.lang.StringBuilder:可变的字符序列，是jdk5.0新加入的，线程不安全，效率要高于StringBuffer.
 */
public class StringBuilders {
    public static void main(String[] args) {
        /*
         * 对比String，StringBuffer,StringBuilder三者在添加上的效率：
         * 效率从高到底： StringBuilde > StringBuffer > String
         */
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for(int i = 0;i<20000;i++){
            buffer.append(String.valueOf(i));}
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间："+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for(int i = 0;i<20000;i++){
            builder.append(String.valueOf(i));}
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间："+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for(int i = 0;i<20000;i++){
            text = text + i;}
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间："+(endTime-startTime));


    }
}
