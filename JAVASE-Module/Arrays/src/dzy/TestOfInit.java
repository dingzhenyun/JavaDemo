package dzy;

/**
 * @author DingZhenYun
 * @create 2020-10-08 11:14
 */
public class TestOfInit {
    public static void main(String[] args) {
        /*
         * 	规定：二维数组分为外层数组的元素，内层数组的元素
         * 		int[][] arr = new int[4][3];
         * 		外层元素：arr[0],arr[1]等
         * 		内层元素：arr[0][0],arr[1][2]等
         *
         *   ⑤ 数组元素的默认初始化值
         *   针对于初始化方式一：比如：int[][] arr = new int[4][3];
         *      外层元素的初始化值为：地址值
         *      内层元素的初始化值为：与一维数组初始化情况相同
         *
         *   针对于初始化方式二：比如：int[][] arr = new int[4][];
         *   	外层元素的初始化值为：null
         *      内层元素的初始化值为：不能调用，否则报错。

         */
        String [][] arr1=new String[4][3];
        System.out.println(arr1[0]);//首地址值
        System.out.println(arr1[1][1]);//null
        int [][] arr2=new int[4][3];
        System.out.println(arr2[0]);//首地址值
        System.out.println(arr2[1][1]);//0
    }
}
