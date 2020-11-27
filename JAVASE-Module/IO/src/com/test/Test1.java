package com.test;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 11:08
 */
/*

分别使用字节流和字符流完成以下程序：

1. 在指定的路径下新建一个 .txt 文件 "test.txt"，利用程序在文件中写入如下内容：

"Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于
1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有
卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级
计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业
环境下，Java更具备了显著优势和广阔前景。"


 */
public class Test1 {
    public static void main(String[] args) {
        t1();
        t2();
    }

    private static void t2() {
        //字符流
        BufferedWriter bufferedWriter= null;
        try {
            File file=new File("IO/test.txt");
            FileWriter fw=new FileWriter(file);
            bufferedWriter = new BufferedWriter(fw);
            String str="Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于\n" +
                    "1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有\n" +
                    "卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级\n" +
                    "计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业\n" +
                    "环境下，Java更具备了显著优势和广阔前景";
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    private static void t1() {
        //字节流
        BufferedWriter bw= null;
        try {
            File file=new File("IO/dbcp.txt");
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            OutputStreamWriter osw=new OutputStreamWriter(fileOutputStream);
            bw = new BufferedWriter(osw);
            String str="Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于\n" +
                    "1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有\n" +
                    "卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级\n" +
                    "计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业\n" +
                    "环境下，Java更具备了显著优势和广阔前景";
            //bw.write(str.getBytes());
            bw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
