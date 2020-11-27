package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author DingZhenYun
 * @create 2019-03-02 15:22
 */
//非文本文件
public class TestFileInputStream {
    public static void main(String[] args) throws Exception { TestFileInputStream t=new TestFileInputStream();
        //t.testFileInputStream();
        //t.testFileInputStream1();
        t.testFileInputStream2();

    }

    private void testFileInputStream2() {
        //优化
        FileInputStream fileInputStream= null;
        try {
            File file=new File("IO/hello.txt");
            fileInputStream = new FileInputStream(file);
            byte [] b=new byte[5];
            int len;
            while((len=fileInputStream.read(b))!=-1){
//                for (byte bb:b) {
//                    System.out.print((char)bb);
//                }
                //String str=new String(b,0,len);
                String str=new String(b);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void testFileInputStream1() {
        FileInputStream fileInputStream=null;
        try {
            File file=new File("IO/hello.txt");
            fileInputStream=new FileInputStream(file);
            int b;
            while((b=fileInputStream.read())!=-1){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}

    public void testFileInputStream() throws Exception {
        //从硬盘读取文件到程序
        //1 new File对象
        File file=new File("IO/hello.txt");
        //2 new FileInputStream对象
        FileInputStream fileInputStream=new FileInputStream(file);
        //3读取
//        int b=fileInputStream.read();
//        while(b!=-1){
//            System.out.print((char) b);
//            b=fileInputStream.read();
//        }
        int b;
        while((b=fileInputStream.read())!=-1){
            System.out.print((char) b);
        }
        //4关闭文件
        fileInputStream.close();
    }
}
