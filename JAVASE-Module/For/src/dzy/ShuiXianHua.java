package dzy;

/**
 * @author DingZhenYun
 * @create 2020-09-06 21:49
 * 水仙花153 = 1*1*1 + 3*3*3 + 5*5*5
 */
public class ShuiXianHua {
    public static void main(String[] args) {
        for (int i=100;i<999;i++){
            int bai=i/100;//百位
            int shi=(i%100)/10;//十位
            int ge=i%10;//个位
            if(i==(bai*bai*bai+shi*shi*shi+ge*ge*ge)){
                System.out.println(i);
            }
        }
    }
}
