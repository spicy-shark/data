package top100;

/**
 * @program: leetCode
 * @description: https://leetcode.cn/problems/regular-expression-matching/
 * @author: Pei Yansheng
 * @date: 2022-05-05 16:40
 **/
public class IsMatch {

  public boolean isMatch(String s, String p) {
    boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    dp[0][0] = true;
    for (int i = 0; i <= s.length(); i++) {
      for (int j = 1; j <= p.length(); j++) {
        if (p.charAt(j - 1) == '*') {
          if (matches(s, p, i, j - 1)) {
            dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
          } else {
            dp[i][j] = dp[i][j - 2];
          }
        } else {
          dp[i][j] = matches(s, p, i, j) && dp[i - 1][j - 1];
        }
      }
    }
    return dp[s.length()][p.length()];
  }

  public boolean matches(String s, String p, int i, int j) {
    if (i == 0) {
      return false;
    }
    if (p.charAt(j - 1) == '.') {
      return true;
    }
    return s.charAt(i - 1) == p.charAt(j - 1);
  }

}
