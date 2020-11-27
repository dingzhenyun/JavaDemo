package com.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author DingZhenYun
 * @create 2019-03-02 16:41
 */
//文本文件
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr= null;
        try {
            File file=new File("IO/dbcp.txt");
            fr = new FileReader(file);
            char [] c=new char[100];
            int len=0;
            while((len=fr.read(c))!=-1){
                String str=new String(c,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
