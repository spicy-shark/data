package top100;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-leetcode-solution/
 * @author: Pei Yansheng
 * @date: 2022-05-04 22:40
 **/
public class LongestPalindrome {

  public String longestPalindrome(String s) {
    if (s.length() <= 1) {
      return s;
    }
    boolean[][] dp = new boolean[s.length()][s.length()];
    int begin = 0;
    int maxLen = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      for (int j = i; j < s.length(); j++) {
        int len = j - i + 1;
        dp[i][j] = s.charAt(i) == s.charAt(j) && (len <= 2 || dp[i + 1][j - 1]);
        if (len > maxLen && dp[i][j]) {
          begin = i;
          maxLen = len;
        }
      }
    }

    return s.substring(begin, begin + maxLen);
  }

}
