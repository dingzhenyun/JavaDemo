package com.otherstream;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 10:18
 */
/*
转换流InputStramReader  OutputStramWriter
解码：字节数组--》字符串
编码：字符串---》字节数组
 */
public class TestChangeStream {
    public static void main(String[] args)  {
        //解码
        BufferedReader br= null;
        BufferedWriter bw= null;
        try {
            File f1=new File("IO/dbcp.txt");
            FileInputStream pis=new FileInputStream(f1);
            InputStreamReader isr=new InputStreamReader(pis);
            br = new BufferedReader(isr);
            //编码
            File f2=new File("IO/dbcp222.txt");
            FileOutputStream fos=new FileOutputStream(f2);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            String str;
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
            }if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
