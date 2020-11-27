package com.day20190223pm;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author DingZhenYun
 * @create 2019-02-24 11:29
 */
public class TestMap1 {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(new Person("ss",23),3);
        tm.put(new Person("ff",44),13);
        tm.put(new Person("vv",43),45);
        tm.put(new Person("fd",2),2);
        tm.put(new Person("yy",44),3);
        Set set=tm.entrySet();
        for (Object obj:set) {
            Map.Entry m=(Map.Entry)obj;
            System.out.println(obj);
        }

        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof C&&o2 instanceof C){
                    C c1=(C)o1;
                    C c2=(C)o2;
                    int i=c1.getId().compareTo(c2.getId());
                    if(i==0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    else
                        return i;
                }
                return 0;
            }
        };
        TreeMap ts1=new TreeMap(comparator);
        ts1.put(new C("aa",3),23);
        ts1.put(new C("vv",23),3);
        ts1.put(new C("hh",31),22);
        ts1.put(new C("ve",4),1);
        ts1.put(new C("nn",23),5);
        ts1.put(new C("f",31),4);
        Set s=ts1.keySet();
        for (Object obj:s) {
            System.out.println(obj+"_-"+ts1.get(obj));
        }

    }

}
