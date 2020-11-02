package com.sun.leetcode.demo.test.easy;

/**
 * @author shawn
 * @descript
 * @create 2020-11-02 7:36 下午
 */
public class Test53 {
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);

    }

    public static int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            if(sum >0){
                sum +=nums[i];
            }else{
                sum =nums[i];
            }

            res=Math.max(res,sum);
        }
        return res;
    }
}
