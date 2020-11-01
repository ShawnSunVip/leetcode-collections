package com.sun.leetcode.demo.test.easy;

import org.springframework.util.StringUtils;

import java.util.concurrent.ForkJoinPool;

/**
 * @author shawn
 * @descript
 * @create 2020-10-31 9:07 下午
 */
public class Test28 {
    public static void main(String[] args) {
        String haystack ="c";
        String needle ="c";
        int i = strStr(haystack, needle);
        System.out.println(needle+"在"+haystack+"中位置是："+i);


    }

    public static int strStr(String haystack, String needle) {
        int lenH =haystack.length();
        int lenN =needle.length();
        if(lenN ==0){
            return 0;
        }
        if(lenH <lenN){
            return -1;
        }

        char first = needle.charAt(0);
        int max =lenH -lenN;
        for (int i = 0; i <=max ; i++) {
            // 找到第一个所在的下标
            if(first != haystack.charAt(i)){
                while (++i <= max && first != haystack.charAt(i));
            }
            System.out.println(i+"-"+max);

            if(i <= max){
                //判断下一个元素在needle中的位置
                int j=i+1;
                int end = j+lenN-1;
                for (int k = 1; j < end && haystack.charAt(j)
                        == needle.charAt(k); j++, k++);
                if(j ==end){
                   return i;
                }
            }
        }
        return -1;
    }


}
