package Offer;

/*
https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/solutions/796108/di-zi-fen-xi-shi-yong-dong-tai-gui-hua-q-jlr7/
 */
public class Offer14_2 {

  final long MOD = 1000000007;

  public int cuttingRope(int n) {
    long[] dp = new long[n + 1];
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      for (int j = 1; j <= i / 2; j++) {
        long product = getMax(i, j, dp) % MOD;
        if (dp[i] < product) {
          dp[i] = product;
        }
      }
    }
    return (int) dp[n];
  }

  public long getMax(int i, int j, long[] dp) {
    long product = 0;
    if ((dp[j] % MOD) * (dp[i - j] % MOD) > product) {
      product = (dp[j] % MOD) * (dp[i - j] % MOD) % MOD;
    }
    if ((j % MOD) * (dp[i - j] % MOD) > product) {
      product = (j % MOD) * (dp[i - j] % MOD) % MOD;
    }
    if ((dp[j] % MOD) * ((i - j) % MOD) > product) {
      product = (dp[j] % MOD) * ((i - j) % MOD) % MOD;
    }
    if ((j % MOD) * ((i - j) % MOD) > product) {
      product = (j % MOD) * ((i - j) % MOD) % MOD;
    }
    return product;
  }

}
