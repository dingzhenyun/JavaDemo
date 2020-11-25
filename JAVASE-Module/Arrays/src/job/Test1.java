package job;

/**
 * @author DingZhenYun
 * @create 2020-10-13 23:10
 * 创建一个长度为 6 的 int 型数组，要求数组元素的值都在 1 30 之间，且是随机赋值。同时，要求元素的值各不相同。
 */
public class Test1 {
    public static void main(String[] args) {
        funcation1();
        System.out.println();
        funcation2();
    }

    public static void funcation1() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                int random = (int) (Math.random() * 30 + 1);
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == random) {
                        count++;
                    }
                }
                if (count == 0) {
                    arr[i] = random;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void funcation2() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                int random = (int) (Math.random() * 30 + 1);
                boolean flag=false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == random) {
                        flag=true;
                    }
                }
                if (!flag) {
                    arr[i] = random;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
