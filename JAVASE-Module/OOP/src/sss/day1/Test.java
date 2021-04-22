package sss.day1;

import java.io.PrintStream;

/**
 * @author DingZhenYun
 * @create 2021-04-21 0:52
 */
public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        method(a,b);//method方法调用后打印a=100,b=100
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    //方法一
//    public static void method(int a,int b){
//        a=a*10;
//        b=b*10;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.exit(0);
//    }
    //方法二
    public static void method(int a,int b){

        PrintStream ps=new PrintStream(System.out){
            @Override
            public void print(String s) {
                if("a=10".equals(s)){
                    s="a=100";
                }else if("b=10".equals(s)){
                    s="b=100";
                }
                super.print(s);
            }
        };
        System.setOut(ps);
    }
}
