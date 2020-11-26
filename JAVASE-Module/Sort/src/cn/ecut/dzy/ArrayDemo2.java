package cn.ecut.dzy;

import java.util.Scanner;

/*数组行列交换
 */
public class ArrayDemo2 {
    public static void main(String [] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("输出原数组：");
        PrintArray(arr);
        Scanner scanner=new Scanner(System.in);
        int arr2[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println("输出变化数组：");
        PrintArray(arr2);
    }
    private static void PrintArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
