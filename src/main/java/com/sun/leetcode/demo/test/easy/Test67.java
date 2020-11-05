package com.sun.leetcode.demo.test.easy;

/**
 * @author sunxiang
 * @date 2020-11-05 18:17
 **/
public class Test67 {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        String s = addBinary(a, b);
        System.out.println(a+"和"+b+"的和是："+ s);
    }

    public static String addBinary(String a, String b) {
        StringBuffer str = new StringBuffer();
        int n = Math.max(a.length(),b.length());
        int count=0;
        for (int i = 0; i <n ; i++) {
            count +=i<a.length()?(a.charAt(a.length()-1-i)-'0'):0;

            count +=i<b.length()?(b.charAt(b.length()-1-i)-'0'):0;
            str.append((char)(count%2+'0'));
            count /=2;
        }
        if(count>0){
            str.append('1');
        }
        str.reverse();
        return str.toString();
    }

}
