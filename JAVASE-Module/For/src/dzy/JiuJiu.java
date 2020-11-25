package dzy;

/**
 * @author DingZhenYun
 * @create 2020-09-06 22:28
 * 九九乘法表
 * 100 以内的 所有质数
 */
public class JiuJiu {
    public static void main(String[] args) {
        test99();
        test2();
        test3();
        test4();
    }

    public static void test99(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }


    public static void test2(){
//        100以内的所有质数的输出。
//        质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。
//        最小的质数是：2
        boolean flag=true;
        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println("1-100的质数:"+i);
            }
            flag=true;
        }
    }

    public static void test3(){
        //对PrimeNumberTest.java文件中质数输出问题的优化
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值
        int count = 0;//记录质数的个数
        Long startTime=System.currentTimeMillis();
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        for(int i=2;i<=1000000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if(isFlag){
                count++;
            }
            isFlag=true;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long endtime = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (endtime - startTime));//17110 - 优化一：break:1546 - 优化二：13

    }

    public static void test4(){
        int count = 0;//记录质数的个数
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        label:for(int i = 2;i <= 100000;i++){//遍历100000以内的自然数
            for(int j = 2;j <= Math.sqrt(i);j++){//j:被i去除
                if(i % j == 0){ //i被j除尽
                    continue label;
                }
            }
            //能执行到此步骤的，都是质数
            count++;

        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));//17110 - 优化一：break:1546 - 优化二：13
    }
}
