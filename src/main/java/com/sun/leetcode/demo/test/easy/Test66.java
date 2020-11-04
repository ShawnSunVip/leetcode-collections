package com.sun.leetcode.demo.test.easy;

import java.util.Arrays;

/**
 * @author shawn
 * @descript
 * @create 2020-11-04 6:50 下午
 */
public class Test66 {
    public static void main(String[] args) {
        int[] digits={9,9,9};
        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        if(digits ==null){
            return null;
        }


        long next=0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <digits.length ; i++) {
            s.append(digits[i]);
        }
        next =Long.parseLong(s.toString());
        next+=1;
        String val=String.valueOf(next);
        int count =String.valueOf(next).length();
        int[] result= new int[count];
        for (int i = 0; i <count ; i++) {
            result[i] = Integer.valueOf(val.split("")[i]);
        }
        return result;
    }
}
