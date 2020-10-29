package com.sun.leetcode.demo.test.easy;

/**
 * @author shawn
 * @descript
 * 27 移除元素
 * @create 2020-10-29 9:13 下午
 */
public class Test27 {
    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int val =1;
        int length = removeElement(nums, val);
        for (int i = 0; i <length ; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int removeElement(int[] nums, int val) {
        if(nums == null){
            return 0;
        }

        int num;
        for (int i = 0; i <nums.length ; i++) {
            num = nums[i];
            if(num ==val){
                for (int j = i+1; j <nums.length ; j++) {
                    if(nums[j] !=val){
                        nums[i] =nums[j];
                        nums[j] =num;
                        break;
                    }
                }

            }

        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                count++;
            }
        }
        return count;
    }


}
