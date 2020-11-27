package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DingZhenYun
 * @create 2019-03-14 13:26
 */
/*
1模拟一个trim方法，去除字符串两端的空格。

2将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”

3获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ ab”在 “abkkcadkabkebfkabkskab”
      中出现的次数
4获

5.对字符串中字符进行自然顺序排序。
提示：
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort();
3）将排序后的数组变成字符串。

 */
public class Test3 {
    public static void main(String[] args) {
        String s=m1(" af d df ");
        String s1=m1("            ");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(m2("acvdfge",1,4));
        m3("acvdfge",1,4);
        m4("abkkcadkabkebfkabkskab","abk");
        List<String> ss=m5("abcwerthelloyuiodef","cvhellobnm");
        System.out.println(ss);
        m6("acfdasdf");
    }

    private static void m6(String string) {
        //5.对字符串中字符进行自然顺序排序。
        //提示：
        //1）字符串变成字符数组。
        //2）对数组排序，选择，冒泡，Arrays.sort();
        //3）将排序后的数组变成字符串。
        char [] arr=string.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }

    private static void m4(String str,String a) {
        //获取一个字符串在另一个字符串中出现的次数。
        //      比如：获取“ ab”在 “abkkcadkabkebfkabkskab”
        //      中出现的次数
        int count=0;
        /*for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals(a))
                count++;
            else
                continue;;
        }*/
        int len;
        while((len=str.indexOf(a))!=-1){
            count++;
            str=str.substring(len+2);

        }
        System.out.println("a字符串出现的次数为："+count);
    }
    private static List<String> m5(String str1, String str2) {
        //取两个字符串中最大相同子串。比如：
        //   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
        //   提示：将短的那个串进行长度依次递减的子串与较长
        //   的串比较。
        String maxstr=(str1.length()>str2.length())?str1:str2;
        String minstr=(str1.length()<str2.length())?str1:str2;
        int len=minstr.length();
        List<String> list=new ArrayList<String>();
        for(int i=0;i<len;i++){
            for(int x=0,y=len-i;y<=len;x++,y++){
                String str=str2.substring(x,y);
                if(str1.contains(str)){
                    list.add(str);
                }
            }
            if(list.size()!=0){
                return list;
            }
        }
        return null;
    }
    private static void m3(String str,int f,int e) {
        //将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
        String str1=str.substring(0,f);
        String str3=str.substring(e+1);
        for(int i=e;i>=f;i--){
            char c=str.charAt(i);
            str1=str1+c;
        }
        str1=str1+str3;
        System.out.println(str1);
        //ArrayUtils要导包
    }

    private static String m2(String str,int f,int e) {
        //将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
        char [] chars=str.toCharArray();
        for(int i=f,j=e;i<j;i++,j--){
            char temp=chars[j];
            chars[j]=chars[i];
            chars[i]=temp;
        }
        return new String(chars);
    }

    private static String m1(String str) {
        //1模拟一个trim方法，去除字符串两端的空格。

        int start=0;
        int end=str.length()-1;
        while(start<end&&str.charAt(start)==' '){
            start++;
        }
        while (start<end&&str.charAt(end)==' '){
            end--;
        }
        String newstr = str.substring(start,end+1);
        return newstr;
    }
}
