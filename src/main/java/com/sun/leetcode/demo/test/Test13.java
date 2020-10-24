package com.sun.leetcode.demo.test;

/**
 * @author shawn
 * @descript  罗马数字转整数
 * @create 2020-10-24 7:53 下午
 */
public class Test13 {
    public static void main(String[] args) {
        String str="LVIII";
        int cmxcix = romanToInt(str);
        System.out.println(str+"="+cmxcix);

    }

    public static int romanToInt(String s) {
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            if(i+1 <s.length()){
                int num =getValue(s.charAt(i)) < getValue(s.charAt(i+1))? -getValue(s.charAt(i)) : getValue(s.charAt(i));
                sum +=num;
            }else{
                sum += getValue(s.charAt(s.length()-1));
            }

        }
        return sum;
    }

    private static int getValue(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default:return 0;
        }

    }

}
