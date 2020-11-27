package com.xunhuan;

import java.io.File;
import java.io.FileFilter;

/**
 * @author DingZhenYun
 * @create 2019-03-17 14:37
 */
public class MyFilters implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //判断获取的是目录,直接返回true
        if(pathname.isDirectory())
            return true;
        return pathname.getName().endsWith(".java");
    }
}
