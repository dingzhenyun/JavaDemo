package com.day20190223pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author DingZhenYun
 * @create 2019-02-24 15:07
 */
/*
|-----Hashtable：是一个古老的实现类，线程安全的，不可以添加null键，null值不建议使用。
				|-----子类：Properties：常用来处理属性文件,键值对都为String
 */
public class TestHashTable {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream(new File("jdbc.properties")));
        String s=properties.getProperty("user");
        System.out.println(s);
    }
}
