package com.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author DingZhenYun
 * @create 2019-03-17 13:47
 */
/*
 *  自定义过滤器
 *  实现FileFilter接口,重写抽象方法
 */
public class MyFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        /*
         * pathname 接受到的也是文件的全路径
         * c:\\demo\\1.txt
         * 对路径进行判断,如果是java文件,返回true,不是java文件,返回false
         * 文件的后缀结尾是.java
         */
        return pathname.getName().endsWith(".java");
    }
}
