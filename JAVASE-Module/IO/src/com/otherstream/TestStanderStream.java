package com.otherstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author DingZhenYun
 * @create 2019-03-03 10:37
 */
/*
System.in和System.out分别代表了系统标准的输入和输出设备

从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
直至当输入“e”或者“exit”时，退出程序。

 */
public class TestStanderStream {
    public static void main(String[] args) {
        BufferedReader br= null;
        try {
            InputStream is=System.in;
            InputStreamReader isr=new InputStreamReader(is);
            br = new BufferedReader(isr);
            String str;
            while(true){
                System.out.println("输入：");
                str=br.readLine();
                if(str.equalsIgnoreCase("e")||str.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println(str.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
