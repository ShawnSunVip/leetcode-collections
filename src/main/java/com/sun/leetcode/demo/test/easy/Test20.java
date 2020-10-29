package com.sun.leetcode.demo.test.easy;

import java.util.concurrent.ForkJoinPool;

/**
 * @author sunxiang
 * 20 有效的括号
 * @date 2020-10-26 11:53
 **/
public class Test20 {
    public static void main(String[] args) {
        String str="([)]";
        boolean valid = isValid(str);
        System.out.println(str+"是否有效括号的结果："+valid);
    }

    public static boolean isValid(String s) {
        boolean isValid =false;
        // 判断字符的个数是否是偶数，如果奇数肯定不是有效括号
        if(s.length()%2 !=0){
            return isValid;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            stringBuilder.append(getValue(s.charAt(i)));
        }
        String str =stringBuilder.toString();

        for (int i = 0; i <str.length() ; i++) {
            for (int j = str.length()-1; j>0 ; j--) {
                int c1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                int c2 =  Integer.parseInt(String.valueOf(str.charAt(j)));
                if(c1 +c2 ==10){
                    String substring = str.substring(i, (j - i + 1));
                    for (int k = 0; k <substring.length() ; k++) {

                    }
                }
            }
        }

        return isValid;
    }

    private static int getValue(char x){
        switch (x){
            case '(': return 1;
            case ')': return 9;
            case '[': return 2;
            case ']': return 8;
            case '{': return 3;
            case '}': return 7;
            default: return 0;
        }
    }

    // 回文
    public static boolean isPalindrome(int x) {
        boolean isPalindrome =false;
        int firstnum=x;
        long res=0;
        if(x<0){
            return isPalindrome;
        }
        while (x != 0){
            res =res*10 + x%10;
            x /=10;
        }
        int y = (int)res ==res? (int)res :0;
        if(firstnum == y){
            isPalindrome=true;
        }
        return isPalindrome;
    }
}
