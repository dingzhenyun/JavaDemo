package dzy;

/**
 * @author DingZhenYun
 * @create 2020-09-06 21:41
 * 1~100 之间所有奇数的和
 */
public class ForTest1 {
    public static void main(String[] args) {

        System.out.println("方法一:"+funcation1());
        System.out.println("方法2:"+funcation2());
    }

    //方法一
    public static  int funcation1(){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    //方法二
    public static  int funcation2(){
        int sum=0;
        for(int i=1;i<=100;i+=2){
            sum+=i;
        }
        return sum;
    }
}
