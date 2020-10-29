package com.sun.leetcode.demo.test.easy;

import java.util.concurrent.ForkJoinPool;

/**
 * @author shawn
 * @descript
 * 26 删除排序数组中重复项
 * @create 2020-10-28 6:52 下午
 */
public class Test26 {
    //nums = [0,0,1,1,1,2,2,3,3,4]
    //nums = [0,1,2,3,4,0,1,1,2,3]
    // length =5
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates2(nums);
        for (int j = 0; j <length ; j++) {
            System.out.println(nums[j]);
        }
    }


    public static int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int count;
        // 模仿冒泡排序
        for (int i = 0; i <nums.length ; i++) {
            int x=0;
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                    nums[i] =nums[i] +nums[j];
                    nums[j] =nums[i] -nums[j];
                    nums[i] =nums[i] -nums[j];
                    i++;
                    x++;
                    System.out.println("i:"+i);
                    System.out.println("x:"+x);
                }
            }
            i = i-x;
        }
        // 获取最大值下标+1
        int x=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]>=nums[i+1]){
                x=i+1;
                break;
            }
        }

        return x;
    }

    public static int removeDuplicates2(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int num;
        int count=0;
        for (int i = 1; i <nums.length ; i++) {
            num=nums[i];
            if(num !=nums[i-1]){
                count++;
                nums[count] =num;
            }
        }
        return count+1;
    }
}
