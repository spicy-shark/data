package Offer;

/*
https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/?favorite=xb9nqhhg
 */
public class Offer10_2 {

  public int numWays(int n) {
    if (n < 2) {
      return 1;
    }
    final int MOD = 1000000007;
    int f0 = 1;
    int f1 = 1;
    int fn = f0 + f1;
    for (int i = 2; i < n + 1; i++) {
      fn = (f0 + f1)  % MOD;
      f0 = f1;
      f1 = fn;
    }
    return fn;
  }

}
