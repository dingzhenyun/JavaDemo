package day20190223;
//自定义异常类
/**
 * @author DingZhenYun
 * @create 2019-02-23 13:15
 */
public class TestException extends RuntimeException{
    private static final long serialVersionUID = 2592091967751347918L;
    public TestException(){}

    public TestException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int i=0;
        if (i==0)
            throw new TestException("不能为0");
        System.out.println(10/i);
    }
}
