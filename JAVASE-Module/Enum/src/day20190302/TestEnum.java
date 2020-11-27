package day20190302;

/**
 * @author DingZhenYun
 * @create 2019-03-02 11:04
 */
//定义枚举类
class Season{
    //1.属性为privat fianl
    private final String seasonName;
    private final String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //声明为final的属性，在构造器中调用
    private  Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public static final Season SP=new Season("sp","春天");
    public static final Season SM=new Season("SM","夏天");
    public static final Season FA=new Season("FA","秋天");
    public static final Season W=new Season("W","东天");
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Season s1=Season.FA;
        System.out.println(s1);
    }
}
