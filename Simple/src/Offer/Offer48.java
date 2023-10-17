package Offer;

public class Offer48 {

  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int[] dp = new int[s.length()];
    dp[0] = 0;
    int max = 1;
    boolean contains;
    for (int i = 1; i < s.length(); i++) {
      contains = false;
      int j = i - 1;
      while (j >= dp[i - 1]) {
        if (s.charAt(j) == s.charAt(i)) {
          contains = true;
          break;
        }
        j--;
      }
      if (contains) {
        dp[i] = j + 1;
      } else {
        dp[i] = dp[i - 1];
      }
      max = Math.max(max, i - dp[i] + 1);
    }
    return max;
  }

}
