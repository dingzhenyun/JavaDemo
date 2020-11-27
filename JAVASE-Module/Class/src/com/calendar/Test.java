package com.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author DingZhenYun
 * @create 2019-03-15 10:07
 */
public class Test {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        c.add(Calendar.DAY_OF_MONTH,2);
        day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        c.set(Calendar.DAY_OF_MONTH,23);
        Date d=c.getTime();
        System.out.println(d);
    }
}
