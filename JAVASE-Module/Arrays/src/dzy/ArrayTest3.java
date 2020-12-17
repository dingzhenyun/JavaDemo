package dzy;

/**
 * @author DingZhenYun
 * @create 2019-02-15 22:34
 */
public class ArrayTest3{
    public static void main(String[] args) {
        int [] array=new int []{2,34,45,6,-388,42,234,5,-2};
        //max
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i])
                max=array[i];
        }
        System.out.println("max"+max);
        //min
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i])
                min=array[i];
        }
        System.out.println("min"+min);
        //sum
        int sum=0;
        for(int i=1;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("sum"+sum);
        //avg
        float avg=0f;
        avg=sum/array.length;
        System.out.println(avg);
        //复制
        int [] a1=new int[array.length];
        for(int i=0;i<array.length;i++){
            a1[i]=array[i];
        }
        //反转
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
        //遍历
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+"\t");
        }
        System.out.println();
        //使用冒泡排序
        /*for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
               if(array[j]>array[j+1]) {
                   int t = array[j];
                   array[j]=array[j+1];
                   array[j+1]=t;
               }
            }
        }*/
        //直接选择排序
        /*for(int i=0;i<array.length-1;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]) {
                    int t = array[j];
                    array[j]=array[i];
                    array[i]=t;
                }
            }
        }*/
        //优化
        System.out.println("dddddddddddddddddddd");
        for(int i=0;i<array.length-1;i++){
            int t=i;
            for(int j=i;j<array.length;j++){
                if(array[t]>array[j]){
                    t=j;
                }
            }
            if(t!=i){
                int temp=array[t];
                array[t]=array[i];
                array[i]=temp;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
