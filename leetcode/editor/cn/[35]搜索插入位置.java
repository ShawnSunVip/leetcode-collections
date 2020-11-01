//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 724 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
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
//leetcode submit region end(Prohibit modification and deletion)
