package com.otherstream;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 15:06
 */
//数据流：处理基本数据类型，String ，字节数组的数据
public class TestDataStream {
    public static void main(String[] args) {
        f1();
        f2();
    }

    private static void f1() {
        DataOutputStream dataOutputStream= null;
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(new File("IO/sss.txt"));
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeInt(344);
            dataOutputStream.writeLong(23333333);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dataOutputStream!=null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void f2() {
        DataInputStream dataInputStream= null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(new File("IO/sss.txt")));
            boolean B=dataInputStream.readBoolean();
            System.out.println(B);
            int a=dataInputStream.readInt();
            System.out.println(a);
            long s=dataInputStream.readLong();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dataInputStream!=null){
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
