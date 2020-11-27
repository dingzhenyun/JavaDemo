package com.string;

/**
 * @author DingZhenYun
 * @create 2019-03-14 11:04
 */
/*
 * public int length()
 * public char charAt(int index):返回在指定index位置的字符。index从0开始
 * public boolean equals(Object anObject)：比较两个字符串是否相等。相等返回true。否则返回false
 * public int compareTo(String anotherString)
 * public int indexOf(String s)：返回s字符串在当前字符串中首次出现的位置。若没有，返回-1
 * public int indexOf(String s ,int startpoint)：返回s字符串从当前字符串startpoint位置开始的，首次出现的位置。
 * public int lastIndexOf(String s):返回s字符串最后一次在当前字符串中出现的位置。若无，返回-1
 * public int lastIndexOf(String s ,int startpoint)
 * public boolean startsWith(String  prefix):判断当前字符串是否以prefix开始。
 * public boolean endsWith(String suffix)：判断当前字符串是否以suffix结束。
 * public boolean regionMatches(int firstStart,String other,int otherStart ,int length):
 * 判断当前字符串从firstStart开始的子串与另一个字符串other从otherStart开始，length长度的字串是否equals
 */
/*
	 * 	public String substring(int startpoint)
		public String substring(int start,int end):返回从start开始到end结束的一个左闭右开的子串。start可以从0开始的。
		pubic String replace(char oldChar,char newChar)
		public String replaceAll(String old,String new)
		public String trim()：去除当前字符串中首尾出现的空格，若有多个，就去除多个。
		public String concat(String str):连接当前字符串与str
		public String[] split(String regex)：按照regex将当前字符串拆分，拆分为多个字符串，整体返回值为String[]

	 */
public class Test2 {
    public static void main(String[] args) {
        String a="2fdsafgavf";
        String b="2fdsa";
        String c="gavf";
        String r="23-fad-fdasf-dfaf";
        System.out.println(a.length());
        System.out.println(a.charAt(1));
        System.out.println(a.indexOf('a',6));
        System.out.println(a.startsWith("2fd"));
        System.out.println(a.regionMatches(6,c,0,c.length()));
        System.out.println(a.substring(2));
        System.out.println(a.replace("a","vv"));
        System.out.println(a.concat("aaaaaaaaaaaaa"));
        String [] arr=r.split("-");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
