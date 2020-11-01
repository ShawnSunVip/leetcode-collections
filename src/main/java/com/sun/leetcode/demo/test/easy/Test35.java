package com.sun.leetcode.demo.test.easy;

import java.util.Arrays;

/**
 * @author shawn
 * @descript
 * @create 2020-11-01 9:06 下午
 */
public class Test35 {
    public static void main(String[] args) {
        int[] nums ={1};
        int target =0;
        int i = searchInsert(nums, target);
        System.out.println(target+"在"+ Arrays.toString(nums)+"中的位置是："+i);

    }

    public static int searchInsert(int[] nums, int target) {
        if(nums ==null){
            return 0;
        }
        int len =nums.length;
        if(len ==1){
            if(nums[0] >=target){
                return 0;
            }
        }
        for (int i = 1; i <len ; i++) {
            if(nums[i-1] >=target){
                return i-1;
            }
            if(nums[i-1] < target){
                if(nums[i]>=target){
                    return i;
                }
            }
        }
        return len;
    }
}
