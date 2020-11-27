package com.stream;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 9:43
 */
public class TestStreamInOut {
    public static void main(String[] args) {
        t1();
    }

    private static void t1() {
        //实现非文本文件的复制
        //1,提供读入写出文件
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            File f1=new File("IO/day5.png");
            File f2=new File("IO/day6.png");
            //2创建对应的节点流
            FileInputStream fis=new FileInputStream(f1);
            FileOutputStream fos=new FileOutputStream(f2);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3将创建的节点流的对象加入到缓冲流构造器
            byte [] b=new byte[1024];
            int len;
            while((len=bis.read(b))!=-1){
                bos.write(b,0,len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4关闭流
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos!=null){

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
