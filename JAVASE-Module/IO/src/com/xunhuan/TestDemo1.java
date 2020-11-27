package com.xunhuan;

import java.io.File;

/**
 * @author DingZhenYun
 * @create 2019-03-17 14:37
 */
/*
 *  遍历目录,获取目录下的所有.java文件
 *  遍历多级目录,方法递归实现
 *  遍历的过程中,使用过滤器
 */
public class TestDemo1 {
    public static void main(String[] args) {
        File dir=new File("F:\\test");
        dis(dir);
    }
    public static void dis(File dir){
        //调用File对象方法listFiles()获取,加入过滤器
        File [] files=dir.listFiles(new MyFilters());
        for(File s:files){
            if(s.isDirectory()){
                dis(s);
            }
            else{
                System.out.println(s);
            }

        }
    }

}
