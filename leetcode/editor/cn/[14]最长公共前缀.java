//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1325 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs ==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String firstStr = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            //"flow" "flight"
            int j=0;
            // 前缀应该小于数组的最小长度
            for (; j <firstStr.length() && j<strs[i].length() ; j++) {
                if(strs[i].charAt(j) != firstStr.charAt(j)){
                    break;
                }
            }
            // 如果j=0 则不存在相同前缀
            if(j==0){
                return "";
            }
            // 截取共同前缀 进行下一次循环判断
            firstStr =firstStr.substring(0,j);

        }

        return firstStr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
