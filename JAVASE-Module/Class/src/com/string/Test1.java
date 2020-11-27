package com.string;

/**
 * @author DingZhenYun
 * @create 2019-03-14 11:02
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "atguigu";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s3));
        String s5 = "atguigujava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

    }
}
