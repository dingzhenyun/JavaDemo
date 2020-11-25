package dzy;

import java.util.Scanner;

/**
 * @author DingZhenYun
 * @create 2020-09-06 21:28
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 *
 * 说明：break关键字的使用：一旦在循环中执行到break，就跳出循环
 */
public class ForTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int n1=scanner.nextInt();
        System.out.println("请输入第二个正整数：");
        int n2=scanner.nextInt();
        int min=(n1>n2)?n2:n1;
        for(int i=min;i>0;i--){
            if((n1%i==0)&&(n2%i==0)){
                System.out.println("最大公约数是:"+i);
                break;
            }
        }
        int max=(n1>n2)?n1:n2;
        for(int i=max;i<=n1*n2;i++){
            if((i%n1==0)&&(i%n2==0)){
                System.out.println("最小公倍数是:"+i);
                break;
            }
        }

    }
}
