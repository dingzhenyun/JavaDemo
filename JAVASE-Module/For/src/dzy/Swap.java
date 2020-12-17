package dzy;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * @author DingZhenYun
 * @create 2019-02-13 11:08
 */
public class Swap {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
    }

    private static void f1() {
        int n=5;
        int m=12;
        System.out.println("n= "+n +" m="+m);
        int temp=0;
        temp=n;
        n=m;
        m=temp;
        System.out.println("n= "+n +" m="+m);
    }
    private static void f2() {
        int n=5;
        int m=12;
        System.out.println("n= "+n +" m="+m);
        n=m+n;
        m=n-m;
        n=n-m;
        System.out.println("n= "+n +" m="+m);
    }
    private static void f3() {
        int n=5;
        int m=12;
        System.out.println("n= "+n +" m="+m);
        n=n^m;
        m=n^m;//(n^m)^m
        n=m^n;//
        System.out.println("n= "+n +" m="+m);
    }
    private static void f4() {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入：");
        int a=s.nextInt();
        int k1=a&15;
        String str1=(k1>9)?((char)(k1-10+'a')+""):(k1+"");
        int a1=a>>4;
        int k2=a1&15;
        String str2=(k2>9)?((char)(k2-10+'a')+""):(k2+"");

    }



}
