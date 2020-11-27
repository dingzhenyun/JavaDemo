package com.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author DingZhenYun
 * @create 2019-03-15 9:27
 */
/*
 * java.text.SimpleDateFormat类易于国际化
 * 格式化：日期--->文本 使用SimpleDateFormat的format()方法
 * 解析：文本--->日期 使用SimpleDateFormat的parse()方法
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        //1
        SimpleDateFormat sdf=new SimpleDateFormat();
        String s=sdf.format(new Date());
        System.out.println(s);//19-3-15 上午9:30

        //2
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        System.out.println(sdf1.format(new Date()));
        //3解析
        Date d=sdf.parse("19-3-15 上午9:30");
        System.out.println(d);
        Date d1=sdf1.parse("2019年03月15 09:34:34");
        System.out.println(d1);
        test();

    }
    public static  void  test() throws ParseException {
        String d11 = "1990-01-01";
        String d12 =  "1990-02-11";
        int i= t1(d11,d12);;
        if(i%5==0||i%5==4){
            System.out.println("网");
        }else{
            System.out.println("大鱼");
        }
    }
    public static int t1(String date11,String date12) throws ParseException {
        //“三天打渔两天晒网”  1990-01-01  XXXX-XX-XX 打渔？晒网？
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=dateFormat.parse(date11);
        Date d2=dateFormat.parse(date12);
        long l=d2.getTime()-d1.getTime();
        return (int) (l/1000/3600/24+1);

    }
}
