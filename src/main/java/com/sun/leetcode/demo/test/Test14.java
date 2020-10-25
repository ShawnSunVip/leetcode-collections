package com.sun.leetcode.demo.test;

/**
 * @author shawn
 * @descript
 * @create 2020-10-25 10:55 上午
 */
public class Test14 {
    public static void main(String[] args) {
        String[] strs = {"dog","dacecar","dar"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs ==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String firstStr = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            //"flow" "flight"
            int j=0;
            // 前缀应该小于数组的最小长度
            for (; j <firstStr.length() && j<strs[i].length() ; j++) {
                if(strs[i].charAt(j) != firstStr.charAt(j)){
                    break;
                }
            }
            // 如果j=0 则不存在相同前缀
            if(j==0){
                return "";
            }
            // 截取共同前缀 进行下一次循环判断
            firstStr =firstStr.substring(0,j);

        }

        return firstStr;
    }
}
