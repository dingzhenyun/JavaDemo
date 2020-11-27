package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author DingZhenYun
 * @create 2019-03-03 11:09
 */
/*

2. 利用程序读取 test.txt 文件的内容, 并在控制台打印


 */
public class Test2 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            File file=new File("IO/test.txt");
            FileReader fileInputStream=new FileReader(file);
             br=new BufferedReader(fileInputStream);
            String str=null;
            while ((str=br.readLine())!=null) {

                System.out.println(str);
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
