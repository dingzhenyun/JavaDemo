package sss;

/**
 * @author DingZhenYun
 * @create 2021-04-23 下午 15:33
 * @program: JavaDemo->FinallyDemo1
 * @description:
 */
public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println(getInt());
    }
    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /** return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30   */
        } finally {
            a = 40;
        }
        return a;
    }
}
