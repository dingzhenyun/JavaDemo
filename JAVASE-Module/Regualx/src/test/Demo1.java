package test;

/**
 * @author DingZhenYun
 * @create 2019-03-17 8:34
 */
/*
 *  实现正则规则和字符串进行匹配,使用到字符串类的方法
 *  String类三个和正则表达式相关的方法
 *    boolean matches(String 正则的规则)
 *    "abc".matches("[a]")  匹配成功返回true
 *
 *    String[] split(String 正则的规则)
 *    "abc".split("a") 使用规则将字符串进行切割
 *
 *    String replaceAll( String 正则规则,String 字符串)
 *    "abc0123".repalceAll("[\\d]","#")
 *    安装正则的规则,替换字符串
 */
public class Demo1 {
    public static void main(String[] args) {
        f1();
        split1();
        split_2();
        split_3();
        replaceAll_1();


    }

    private static void split3() {
    }

    private static void split2() {
    }/*
     * String类方法split对字符串进行切割
     * 192.168.105.27 按照 点切割字符串
     */
    public static void split_3(){
        String ip = "192.168.105.27";
        String[] strArr = ip.split("\\.");
        System.out.println("数组的长度"+strArr.length);
        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }

    /*
     * String类方法split对字符串进行切割
     * 18 22 40 65 按照空格切割字符串
     */
    public static void split_2(){
        String str = "18    22     40          65";
        String[] strArr = str.split(" +");
        System.out.println("数组的长度"+strArr.length);
        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }

    private static void split1() {
        /*
         *  String类方法split对字符串进行切割
         *  12-25-36-98  按照-对字符串进行切割
         */
        String str="123-34-4-45";
        String [] a=str.split("-");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    /*
     * "Hello12345World6789012"将所有数字替换掉
     * String类方法replaceAll(正则规则,替换后的新字符串)
     */
    public static void replaceAll_1(){
        String str = "Hello12345World6789012";
        str = str.replaceAll("[\\d]+", "#");
        System.out.println(str);
    }
    private static void f1() {
        /*
         *  检查QQ号码是否合法
         *  0不能开头,全数字, 位数5,10位
         *  123456
         *  \\d  \\D匹配不是数字
         */
        String str="3433332";
        boolean b=str.matches("[1-9][\\d]{4,9}");
        System.out.println(b);
    }
}
