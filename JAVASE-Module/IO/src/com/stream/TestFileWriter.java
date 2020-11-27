package com.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author DingZhenYun
 * @create 2019-03-02 16:41
 */
public class TestFileWriter {
    public static void main(String[] args) {
        //复制
        String s="IO/dbcp.txt";
        String e="IO/dbcp1.txt";
        TestFileWriter t=new TestFileWriter();
        t.copy(s,e);

    }
    public void copy(String s,String e){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            File start=new File(s);
            File end=new File(e);
            fr = new FileReader(start);
            fw = new FileWriter(end);
            char [] c=new char[100];
            int len;
            while((len=fr.read(c))!=-1) {
                fw.write(c,0,len);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }


    }
}
