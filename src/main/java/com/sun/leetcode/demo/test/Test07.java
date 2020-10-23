package com.sun.leetcode.demo.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shawn
 * @descript
 * @create 2020-10-22 8:26 下午
 */
public class Test07 {
    public static void main(String[] args) {
        int reverse = reverse(-1230);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        // 方案一
        /*int res=0;
        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        while (x !=0){
            int p =x %10;
            System.out.println("p="+p);
            if(res > Integer.MAX_VALUE /10 || res ==Integer.MAX_VALUE/10 && p>7){
                return 0;
            }
            if(res < Integer.MIN_VALUE /10 || res ==Integer.MIN_VALUE/10 && p<-8){
                return 0;
            }
            res =res*10 +p;
            x /=10;
            System.out.println("res="+res);
            System.out.println("x="+x);
            System.out.println("=======");
        }
        return res;*/

        // 方案二
        long res=0;
        while (x !=0){
            System.out.println("x="+x);
            res =res *10 + x%10;
            System.out.println("res="+res);
            x /=10;
        }
        // 用强制转换long来判断res是否溢出，如果溢出返回0
        return (int) res ==res?(int) res:0;
    }
}
