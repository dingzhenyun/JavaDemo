package com.otherstream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author DingZhenYun
 * @create 2019-03-03 15:45
 */
//RandomAccessFile 类支持 “随机访问” 的方式，程序可以直接跳到文件的任意地方来读、写文件
    //既可以当输入流，又可以当输出流
public class TestRandomAccessFile {
    public static void main(String[] args) {
        t1();
        //t2();
        t3();
    }

    private static void t3() {
        //实现插入效果
        RandomAccessFile r2= null;
        try {
            r2 = new RandomAccessFile(new File("IO/dbcp111.txt"),"rw");
            r2.seek(3);
            StringBuffer sb=new StringBuffer();
            byte [] b=new byte[200];
            int len;
            while((len=r2.read(b))!=-1){
                sb.append(new String(b,0,len));
            }
            r2.seek(3);
            r2.write("aaaaaaaaaaa".getBytes());
            r2.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(r2!=null){
                try {
                    r2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void t2() {
        //实现的实覆盖效果
        RandomAccessFile r2= null;
        try {
            r2 = new RandomAccessFile(new File("IO/dbcp111.txt"),"rw");
            r2.seek(3);
            r2.write("aaaaaaaaaaa".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(r2!=null){
                try {
                    r2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void t1() {
        //对文件读写
        RandomAccessFile r1= null;
        RandomAccessFile r2= null;
        try {
            r1 = new RandomAccessFile(new File("IO/dbcp1.txt"),"r");
            r2 = new RandomAccessFile(new File("IO/dbcp111.txt"),"rw");
            byte [] b=new byte[20];
            int len;
            while((len=r1.read(b))!=-1){
                r2.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(r1!=null){
                try {
                    r1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(r2!=null){
                try {
                    r2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
