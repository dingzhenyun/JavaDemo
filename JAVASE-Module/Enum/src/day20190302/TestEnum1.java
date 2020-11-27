package day20190302;

/**
 * @author DingZhenYun
 * @create 2019-03-02 11:04
 */
//枚举类Enum
    //  //values()
//        //valueOf(str):str一定是枚举类的对象名字
    //
enum Season1{
    SP("sp","春天"),
     SM("SM","夏天"),
    FA("FA","秋天"),
     W("W","东天");

    private final String seasonName;
    private final String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    private  Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

public class TestEnum1 {
    public static void main(String[] args) {
        Season s1=Season.SM;
        System.out.println(s1);
        //values()
        Season1 [] arry=Season1.values();
        for (Season1 ss:arry) {
            System.out.println(ss);
        }
        //valueOf(str):str一定是枚举类的对象名字
        String str="SP";
        Season1 sea=Season1.valueOf(str);
        System.out.println(sea);
    }
}
