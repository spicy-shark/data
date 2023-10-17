package Offer;

public class Offer49 {

  public int nthUglyNumber(int n) {
    int a = 0;
    int b = 0;
    int c = 0;
    int[] dp = new int[n];
    dp[0] = 1;
    for (int i = 1; i < n; i++) {
      int na = 2 * dp[a];
      int nb = 3 * dp[b];
      int nc = 5 * dp[c];
      dp[i] = Math.min(Math.min(na, nb), nc);
      if (dp[i] == na) {
        a++;
      }
      if (dp[i] == nb) {
        b++;
      }
      if (dp[i] == nc) {
        c++;
      }
    }
    return dp[n - 1];
  }

}
