package dzy;

import java.util.Scanner;

/**
 * @author DingZhenYun
 * @create 2020-09-06 22:00
 ：
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 * 说明：
 * 1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)
 * 2. 结束循环有几种方式？
 *      方式一：循环条件部分返回false
 * 	 方式二：在循环体中，执行break
 */
public class SiFor {
    public static void main(String[] args) {
        funcation1();
    }
    //方法一
    public static void funcation1(){
        int ji=0;
        int o=0;
        for(;;){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入：");
            int a=sc.nextInt();
            if(a>0){
                o++;
            }else if(a<0){
                ji++;
            }else {
                break;
            }
        }
        System.out.println("o:"+o);
        System.out.println("ji:"+ji);
    }

    //方法一
    public static void funcation2(){
        int ji=0;
        int o=0;
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入：");
            int a=sc.nextInt();
            if(a>0){
                o++;
            }else if(a<0){
                ji++;
            }else {
                break;
            }
        }
        System.out.println("o:"+o);
        System.out.println("ji:"+ji);
    }
}
