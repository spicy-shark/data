package Offer;

public class Offer14 {

  public int cuttingRope(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      for (int j = 1; j <= i / 2; j++) {
        int product = getMax(i, j, dp);
        if (dp[i] < product) {
          dp[i] = product;
        }
      }
    }
    return dp[n];
  }

  public int getMax(int i, int j, int[] dp) {
    int product = 0;
    if (dp[j] * dp[i - j] > product) {
      product = dp[j] * dp[i - j];
    }
    if (j * dp[i - j] > product) {
      product = j * dp[i - j];
    }
    if (dp[j] * (i - j) > product) {
      product = dp[j] * (i - j);
    }
    if (j * (i - j) > product) {
      product = j * (i - j);
    }
    return product;
  }

}
