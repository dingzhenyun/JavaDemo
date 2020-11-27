package com.com.classofbaoz;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author DingZhenYun
 * @create 2019-02-19 12:09
 */
/*
利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类java.util.Vector可以根据需要动态伸缩。
创建Vector对象：Vector v=new Vector();
给向量添加元素：v.addElement(obj);   //obj必须是对象
取出向量中的元素：Object  obj=v.elementAt(0);
注意第一个元素的下标是0，返回值是Object类型的。
计算向量的长度：v.size();
若与最高分相差10分内：A等；20分内：B等；
      30分内：C等；其它：D等

 */
public class Test {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Vector v = new Vector();
            System.out.println("输入学生的成绩：");
            int maz=0;
            for(;;) {

                int s = sc.nextInt();
                if(s<0)
                    break;
                if(maz<s)
                    maz=s;
                Integer s1=new Integer(s);
                v.addElement(s1);
                //v.addElement(s);
            }
        System.out.println("最高分为"+maz);
            for(int i=0;i<v.size();i++){
                Integer o= (Integer) v.elementAt(i);
                String str=null;
                if(maz-o<=10)
                    str="A";
                else if(maz-o<=20)
                    str="B";
                else if(maz-o<=30)
                    str="C";
                else
                    str="D";
                System.out.println(o+" "+str);
            }
    }
}
