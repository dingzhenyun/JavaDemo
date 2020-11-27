package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author DingZhenYun
 * @create 2019-03-02 16:07
 */
//FileOutPutStream
public class TestFileOutPutStream {
    public static void main(String[] args) {
        testFileOutPutStream1();
        copy();
    }

    private static void copy() {
        //文件复制
        File yuan=new File("IO/hello.txt");
        File mudi=new File("IO/hello2.txt");
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(yuan);
            fos=new FileOutputStream(mudi);
            byte [] s=new byte[100];
            int len;
            while((len=fis.read(s))!=-1){
               fos.write(s,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    private static void testFileOutPutStream1() {
        //把字符串输入到文件中
        FileOutputStream fileOutputStream= null;
        try {
            //1存放文件可以不存在，假如存在则覆盖
            File file=new File("IO/hello1.txt");
            //2
            fileOutputStream = new FileOutputStream(file);
            //3
            fileOutputStream.write(new String("dffdsahjafdskljfdsa").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
