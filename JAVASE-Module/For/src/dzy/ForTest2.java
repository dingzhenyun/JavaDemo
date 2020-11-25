package dzy;

/**
 * @author DingZhenYun
 * @create 2020-09-06 21:46
 * 打印 1~100 之间所有是 7 的 倍数 的整数的 个数及总和 （体会设置计数
 * 器的思想）
 */
public class ForTest2 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=1;i<=100;i++){
            if(i%7==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("count:"+count);
        System.out.println("sun:"+sum);
    }
}
