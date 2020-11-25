package job;

/**
 * @author DingZhenYun
 * @create 2020-10-18 21:28
 * 实现 array2 对 array1 数组的复制
 * 数组中涉及到的常见算法
 */
public class CopyArrays {
    public static void main(String[] args) {
        int [] array1=new int[]{2,3,5,7,11,13,17,19};
        int [] array2=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
            array2[i]=(int)array1[i];
        }
        System.out.println();
        for(int i=0;i<array2.length;i++){
            if(i%2==0){
                array2[i]=i;
            }
        }
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
    }
}
