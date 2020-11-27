package com.test;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 11:09
 */
/*
3. 利用程序复制 test.txt 为 test1.txt
 */
public class Test3 {
    public static void main(String[] args) {
        BufferedReader br= null;
        BufferedWriter bw= null;
        try {
            File file=new File("IO/test.txt");
            FileReader fr=new FileReader(file);
            br = new BufferedReader(fr);
            File file1=new File("IO/test1.txt");
            FileWriter fw=new FileWriter(file1);
            bw =new BufferedWriter(fw);
            String str=null;
            while((str=br.readLine())!=null){
                bw.write(str);
                bw.newLine();
                bw.flush();
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
