package job;

/**
 * @author DingZhenYun
 * @create 2020-10-18 21:40
 * 数组操作
 */
public class ArraysC {
    public static void main(String[] args) {
        String [] arr=new String[]{"aa","bb","vv","dd","ddd"};

        //复制
        String [] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        //反转
        for(int i=0;i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        //方法二：
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
        //查找
        System.out.println();
        //查找（或搜索）
        //线性查找：
        String dest = "BB";
        dest = "CC";

        boolean isFlag = true;

        for(int i = 0;i < arr.length;i++){

            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }

        }
        if(isFlag){
            System.out.println("很遗憾，没有找到的啦！");

        }


        //前提：所要查找的数组必须有序。
        int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int start=0;//索引
        int end=arr2.length-1;
        int n=2;
        boolean flag=true;
        while (true){
            int min=(start+end)/2;
            if(arr2[min]==n){
                System.out.println("找到了--"+n);
                isFlag=false;
                break;
            }else if(arr2[min]>n){
                end=min-1;

            }else{
                start=min+1;
            }
        }
        if(isFlag){
            System.out.println("很遗憾，没有找到的啦！");
        }

    }
}
