package com.sun.leetcode.demo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author shawn
 * @descript
 * @create 2020-10-21 10:01 下午
 */
public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] + nums[j] ==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

