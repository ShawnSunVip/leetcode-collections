package com.sun.leetcode.demo.test.easy;

/**
 * @author shawn
 * @descript
 * @create 2020-11-01 9:20 下午
 */
public class Test38 {
    public static void main(String[] args) {
        int n=6;
        String s = countAndSay(n);
        System.out.println(s);

    }
    //1.     1
    //2.     11
    //3.     21
    //4.     1211
    //5.     111221
    //6.     312211
    //7.     13112221
    public static String countAndSay(int n) {
        if(n ==1){
            return "1";
        }
        StringBuilder stringBuilder =new StringBuilder();
        String str = countAndSay(n-1);
        int start=0;
        int cur=1;
        for (cur = 1; cur <str.length() ; cur++) {
            if(str.charAt(start) != str.charAt(cur)){
                stringBuilder.append(cur-start).append(str.charAt(start));
                start=cur;
            }
        }
        //判断最后一段数是否相等
        if(start !=cur){
            stringBuilder.append(cur-start).append(str.charAt(start));
        }
        return stringBuilder.toString();
    }
}
