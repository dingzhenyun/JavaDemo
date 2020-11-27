package com.day20190223pm;


import java.util.*;

/**
 * @author DingZhenYun
 * @create 2019-02-24 15:49
 */
/*
1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来

2.请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。

 */
class Student{
    private String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        tt1();
        tt2();
    }

    private static void tt2() {
        HashMap<String,Integer> hm=new HashMap<String, Integer>();
        hm.put("aa",234);
        hm.put("yb",2);
        hm.put("cc",24);
        hm.put("dd",122);
        hm.put("hh",24);
        Set<Map.Entry<String,Integer>> set=hm.entrySet();
        List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(set);
        for(Map.Entry<String,Integer> temp1:list){
            System.out.println(temp1);
        }
        System.out.println("------------");
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }

        });
        for(int i=0;i<3;i++){
            System.out.println(list.get(i).getKey());
        }

    }

    private static void tt1() {
        //1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来
        Scanner sc=new Scanner(System.in);
        ArrayList l=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            System.out.println("请输入一个整数：");
            int s=sc.nextInt();
            l.add(s);

        }
        Collections.sort(l);
        Collections.reverse(l);
        for(Object obj:l){
            System.out.println(obj);
        }
    }
}
