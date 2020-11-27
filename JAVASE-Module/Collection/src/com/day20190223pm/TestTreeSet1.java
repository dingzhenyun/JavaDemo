package com.day20190223pm;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author DingZhenYun
 * @create 2019-02-23 22:18
 */
//定制排序
class C{
   private String name;
   private Integer id;

    public C() {
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public C(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return Objects.equals(name, c.name) &&
                Objects.equals(id, c.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

public class TestTreeSet1 {
    public static void main(String[] args) {
        //实现TreeSet定制排序comparator接口的类对象
        Comparator c=new Comparator() {
            /*向TreeSet中添加C类对象，在compare(Object o1, Object o2)中，制定按什么排序

             */
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof C &&o2 instanceof C){
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
        //将对象以形参的方式给TreeSet的构造器中
        TreeSet st1=new TreeSet(c);
        st1.add(new C("AA",34));
        st1.add(new C("BB",33));
        st1.add(new C("GG",35));
        st1.add(new C("TT",32));
        st1.add(new C("CC",33));
        for (Object s:st1) {
            System.out.println(s);
        }
    }
}
