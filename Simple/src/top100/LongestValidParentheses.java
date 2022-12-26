package top100;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/longest-valid-parentheses/solutions/314683/zui-chang-you-xiao-gua-hao-by-leetcode-solution/
 * @author: Pei Yansheng
 * @date: 2022-05-31 23:36
 **/
public class LongestValidParentheses {

  public int longestValidParentheses(String s) {
    if (s.length() < 3) {
      if (s.length() == 2 && "()".equals(s)) {
        return 2;
      }
      return 0;
    }
    int dp[] = new int[s.length()];
    int i = 1;
    int j = 2;
    int max = 0;
    if (s.charAt(i) == ')') {
      if (s.charAt(i - 1) == '(') {
        dp[j] = dp[j - 2] + 2;
        max = Math.max(max, dp[i]);
      } else {
        dp[j] = dp[j - 1];
      }
    }
    return max;
  }

}
