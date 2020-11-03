//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。 
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串 
// 👍 252 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().length() ==0 || s==""){
            return 0;
        }
        String[] str =s.split(" ");
        if(str.length==1){
            return  str[0].length();
        }
        int sum=0;
        for (int i = 0; i <str.length ; i++) {
            if(str[i].length()!=0){
                sum=str[i].length();
            }
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
