package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author DingZhenYun
 * @create 2019-03-02 14:22
 */
/*
访问文件名：
getName()
getPath()
getAbsoluteFile()
getAbsolutePath()
getParent()
renameTo(File newName)//
 */
public class TestFile1 {
    public static void main(String[] args) throws IOException {
        //t1();
        //t2();
        t3();
        t4();
    }

    private static void t4() {
    }

    private static void t3() throws IOException {
        /*
        createNewFile()

        mkDdelete()
        mkDir()irs()
        list()
        listFiles()

         */
        File file1=new File("D:/test/hello.txt");
        System.out.println(file1.delete());
        if(!file1.exists()){
            Boolean b=file1.createNewFile();
            System.out.println(b);
        }
        File file2=new File("D:/test/io2");
        if(!file2.exists()){
            Boolean b=file2.mkdir();
            System.out.println(b);
        }
        File file3=new File("E:\\java核心技术");
        String [] arr=file3.list();
        for (String o:arr) {
            System.out.println(o);
        }
        System.out.println("-----------------");
        File [] arr1=file3.listFiles();
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i].getName());
        }
    }

    private static void t2() {
        /*
        exists()
        canWrite()
        canRead()
        isFile()
        isDirectory()
        lastModified()
        length()

         */
        File file1=new File("D:/test/abc.txt");
        File file2=new File("D:\\test\\io");
        System.out.println(file1.exists());
        System.out.println(file1.canWrite());
        System.out.println(file1.canRead());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(new Date(file1.lastModified()));
        System.out.println(file1.length());
        System.out.println("-----------");
        System.out.println(file2.exists());
        System.out.println(file2.canWrite());
        System.out.println(file2.canRead());
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(new Date(file2.lastModified()));
        System.out.println(file2.length());
    }

    private static void t1() {
        File file1=new File("D:/test/abc.txt");
        File file2=new File("D:\\test\\io");
        File file3=new File("\\IO\\hello1.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.getAbsolutePath());
        System.out.println("--------------");
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getParent());
        System.out.println(file2.getAbsolutePath());
        System.out.println("----------");
        boolean b=file1.renameTo(file3);//要求：file1一定存在，file3一定不存在
        System.out.println(b);
    }
}
