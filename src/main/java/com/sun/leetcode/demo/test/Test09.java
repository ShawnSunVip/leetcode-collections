package com.sun.leetcode.demo.test;

/**
 * 回文数
 * @author sunxiang
 * @date 2020-10-23 11:44
 **/
public class Test09 {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(11);
        System.out.println("result="+palindrome);
    }

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
