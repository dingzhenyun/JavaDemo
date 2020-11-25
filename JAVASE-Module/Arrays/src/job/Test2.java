package job;

/**
 * @author DingZhenYun
 * @create 2020-10-18 21:16
 */
public class Test2 {
    public static void main(String[] args) {
        String foo="blue";
        boolean[] bar=new boolean[2];//boolean默认为false
        for(int i=0;i<bar.length;i++){
            System.out.println(bar[i]);
        }
        if(bar[0]){
            foo="green";
        }
        System.out.println(foo);
        String strs[] = new String[]{"q"};
    }
}
