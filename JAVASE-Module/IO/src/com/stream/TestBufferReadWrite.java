package com.stream;

import java.io.*;

/**
 * @author DingZhenYun
 * @create 2019-03-03 10:00
 */
// BufferReader  readline()
public class TestBufferReadWrite {
    public static void main(String[] args) {
        //t1();
        t2();
    }

    private static void t2() {
        BufferedReader br= null;
        BufferedWriter bw=null;
        try {
            File f1=new File("IO/dbcp.txt");
            File f2=new File("IO/dbcp99.txt");
            FileReader fr=new FileReader(f1);
            FileWriter fw=new FileWriter(f2);
            br = new BufferedReader(fr);
            bw=new BufferedWriter(fw);
//            char [] c=new char[1024];
//            int len;
//            while((len=br.read(c))!=-1){
//                String str=new String(c,0,len);
//                System.out.println(str);
//            }
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
        }


    }

    private static void t1() {
        BufferedReader br= null;
        try {
            File f1=new File("IO/dbcp.txt");
            FileReader fr=new FileReader(f1);
            br = new BufferedReader(fr);
//            char [] c=new char[1024];
//            int len;
//            while((len=br.read(c))!=-1){
//                String str=new String(c,0,len);
//                System.out.println(str);
//            }
            String str=null;
            while((str=br.readLine())!=null){
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
