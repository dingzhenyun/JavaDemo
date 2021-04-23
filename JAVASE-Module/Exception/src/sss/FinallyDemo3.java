package sss;

/**
 * @author DingZhenYun
 * @create 2021-04-23 下午 15:34
 * @program: JavaDemo->FinallyDemo3
 * @description:
 */
public class FinallyDemo3 {
    public static void main(String[]args) {
        System.out.println(new FinallyDemo3().test());
    }
    static int test() {
        int x = 1;
        try {
            System.out.println("1111--"+x);
            return x;
        } finally {
            System.out.println("2222--"+x);
            ++x;
            System.out.println("3333--"+x);
        }
    }
}
