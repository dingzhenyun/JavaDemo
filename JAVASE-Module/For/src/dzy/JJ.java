package dzy;
/*
例题：1）九九乘法表
              2）1—100之间的所有质数

 */
/**
 * @author DingZhenYun
 * @create 2019-02-15 16:28
 */
public class JJ {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

        boolean flag=false;
        for(int i=1;i<=100;i++){
            if(i!=1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {//不是质数
                        flag = true;
                        break;
                    }
                }
            }
            if(flag==false)
                System.out.println(i);
            flag=false;
        }
    }

    private static void f3() {
        //一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身正的约数）
        //例如6=1＋2＋3.编程 找出1000以内的所有完数
        int sum=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){
                if(i%j==0)
                    sum+=j;
            }
            if(i==sum)
                System.out.println(i);
            sum=0;
        }

    }

    private static void f2() {
        //求调和级数中从第多少项开始值大于10，调和级数的第n项形式为：1+1/2+1/3+…+1/n
        int i=1;
        double sum=0;
        while(sum<=10.0){
            sum+=1.0/i;
            i++;
        }
        System.out.println(i);
    }

    private static void f1() {
        //输入两个正整数m和n，求其最大公约数和最小公倍数
        int m=9;
        int n=12;
        int max=(m>n)?m:n;
        int min=(m>n)?n:m;
        for(int i=min;i>=1;i--){
            if(m%i==0&&n%i==0) {
                System.out.println("最大公约数"+i);
                break;
            }
            }
            for(int i=max;i<m*n;i++) {
                if(i%m==0&&i%n==0) {
                    System.out.println("最小公倍数"+i);
                    break;
                }
            }


        }

}
