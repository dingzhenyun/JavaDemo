package com.string;

/**
 * @author DingZhenYun
 * @create 2019-03-15 8:51
 */
/*
 * 1.字符串 与基本数据类型、包装类之间转换
 * ①字符串 --->基本数据类型、包装类:调用相应的包装类的parseXxx(String str);
 * ①基本数据类型、包装类--->字符串:调用字符串的重载的valueOf()方法
 *
 * 2.字符串与字节数组间的转换
 * ①字符串---->字节数组:调用字符串的getBytes()
 * ②字节数组---->字符串：调用字符串的构造器
 *
 * 3.字符串与字符数组间的转换
 * ①字符串---->字符数组：调用字符串的toCharArray();
 * ②字符数组---->字符串:调用字符串的构造器
 */


public class Test4 {
    public static void main(String[] args) {
        //1.字符串 与基本数据类型、包装类之间转换
        String str1 = "123";
        int i = Integer.parseInt(str1);
        System.out.println(i);
        String str2 = i + "";
        str2 = String.valueOf(i);
        System.out.println(str2);
        System.out.println();
        //2.字符串与字节数组间的转换
        String str = "abcd123";
        byte[] b = str.getBytes();
        for(int j = 0;j < b.length;j++){
            System.out.println((char)b[j]);
        }
        String str3 = new String(b);
        System.out.println(str3);
        System.out.println();
        //3.字符串与字符数组间的转换
        String str4 = "abc123中国人";
        char[] c = str4.toCharArray();
        for(int j = 0;j < c.length;j++){
            System.out.println(c[j]);
        }
        String str5 = new String(c);
        System.out.println(str5);
    }

}
