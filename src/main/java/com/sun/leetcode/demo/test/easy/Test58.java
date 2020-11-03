package com.sun.leetcode.demo.test.easy;

/**
 * @author shawn
 * @descript
 * @create 2020-11-03 8:50 下午
 */
public class Test58 {
    public static void main(String[] args) {
        String s ="day";
        int i = lengthOfLastWord(s);
        System.out.println(s+"的最后一个单词坐标是"+i);

    }

    public static int lengthOfLastWord(String s) {
        if(s.trim().length() ==0 || s==""){
            return 0;
        }
        String[] str =s.split(" ");
        if(str.length==1){
            return  str[0].length();
        }
        int sum=0;
        for (int i = 0; i <str.length ; i++) {
            if(str[i].length()!=0){
                sum=str[i].length();
            }
        }
        return sum;
    }
}
