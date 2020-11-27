package com.file;

import java.io.File;

/**
 * @author DingZhenYun
 * @create 2019-03-17 13:47
 */
public class FileDemo {
    public static void main(String[] args) {
        //获取系统中的所有根目录
        File[] fileArr = File.listRoots();
        for (File f : fileArr) {
            System.out.println(f);

        }
        /*
         *  File类的获取功能
         *  File[] listFiles()
         *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
         *  返回的是目录或者文件的全路径
         */
        File file = new File("d:\\JAVA");
        File[] fileArr1 = file.listFiles();
        for(File f : fileArr1){
            System.out.println(f);
        }
        /*
         *  File类的获取功能
         *  String[] list()
         *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
         *  返回只有名字
         */
        File file2 = new File("c:");
        String[] strArr = file2.list();
        System.out.println(strArr.length);
        for(String str : strArr){
            System.out.println(str);
        }
    }
}
