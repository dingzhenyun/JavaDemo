package job;

/**
 * @author DingZhenYun
 * @create 2020-10-18 21:28
 * (1)创建一个 名为 ArrayTest 的 类，在 main() 方法中声明 array1 和 array2 两 个 变量，
 * 他们 是 int 类型的数组。
 * (2)使用大括号 {}{}，把 array1 初始化为 8 个素数： 2,3,5,7,11,13,17,19 。
 * (3)显示 array1 的内容。
 * (4)赋值 array2 变量等于 array1 ，修改 array2 中的偶索引元素，使其等于索引值
 * 如 array[0]=0,array[2]=2) 。打印出 array1 。
 * 思考：
 * array1 和 array2 是什么关系？
 * 拓展：
 * 修改题目，实现 array2 对 array1 数组的复制
 * 3.4
 * 数组中涉及到的常见算法
 */
public class Test3 {
    public static void main(String[] args) {
        int [] array1=new int[]{2,3,5,7,11,13,17,19};
        int [] array2;
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
        array2=array1;
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
