package Offer;

public class Offer19 {

  public boolean isMatch(String s, String p) {
    int sl = s.length();
    int pl = p.length();
    //dp[i][j]表示s(0:i)是否与p(0:j)匹配
    boolean[][] dp = new boolean[sl + 1][pl + 1];
    for (int i = 0; i < sl; i++) {
      for (int j = 0; j < pl; j++) {
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
          dp[i][j] = dp[i - 1][j - 1];
        }
        if (p.charAt(j) == '*') {
          dp[i][j] = dp[i - 1][j] && (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
        }
      }
    }
    return dp[sl][pl];
  }

}
