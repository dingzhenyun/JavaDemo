package com.xunhuan;

import java.io.File;

/**
 * @author DingZhenYun
 * @create 2019-03-17 14:00
 */
/*
 *  对一个目录的下的所有内容,进行完全的遍历
 *  编程技巧,方法的递归调用,自己调用自己
 */
public class TestDemo {
    public static void main(String[] args) {
        File dir=new File("F:\\test");
        listall(dir);
    }
    /*
     *  定义方法,实现目录的全遍历
     */
    public static void listall(File dir){
        System.out.println(dir);
        File [] arr=dir.listFiles();
        for(File f:arr){
            if(f.isDirectory())
                listall(f);
             else
                 System.out.println(f);
        }
    }

}
