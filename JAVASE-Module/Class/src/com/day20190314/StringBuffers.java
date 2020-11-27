package com.day20190314;

/**
 * @author DingZhenYun
 * @create 2019-03-15 8:59
 */
public class StringBuffers {
    public static void main(String[] args) {
        /*
 * java.lang.StringBuffer和StringBuilder:代表可变的字符序列，可以对字符串内容进行增删
 *
 *  StringBuffer append(String s),   StringBuffer append(int n) ,
 StringBuffer append(Object o) ,  StringBuffer append(char n),
 StringBuffer append(long n),  StringBuffer append(boolean n),
 StringBuffer insert(int index, String str)
 public StringBuffer reverse() :反转此StringBuffer,自己
 StringBuffer delete(int startIndex, int endIndex)
 public char charAt(int n )
 public void setCharAt(int n ,char ch)
 StringBuffer replace( int startIndex ,int endIndex, String str)
 public int indexOf(String str)
 public String substring(int start,int end)
 public int length()

 总结：添加：append() 删除：delete(int i,int j) 修改：setCharAt(int index,char ch) 查 charAt(int n);
 插入：insert(int index,String str)  反转：reverse() 长度：length()

 */

            StringBuffer sb = new StringBuffer();
            System.out.println(sb.length());
            sb.append("abc").append("123").append(true);

            // ArrayList list = new ArrayList();
            System.out.println(sb); // HK WC
            sb.insert(3, "hello");
            System.out.println(sb);

            StringBuffer sb1 = sb.reverse();
            System.out.println(sb1);
            System.out.println(sb);
    }
}
