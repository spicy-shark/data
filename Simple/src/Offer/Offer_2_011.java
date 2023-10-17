package Offer;

import java.util.HashMap;
import java.util.Map;

public class Offer_2_011 {

  public int findMaxLength(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0] == 0 ? -1 : 1;
    Map<Integer, Integer> dpMap = new HashMap<>();
    dpMap.put(dp[0], 0);
    int max = 0;
    for (int i = 1; i < nums.length; i++) {
      dp[i] = nums[i] == 0 ? dp[i - 1] - 1 : dp[i - 1] + 1;
      if (dp[i] == 0) {
        max = Math.max(max, i + 1);
      } else {
        if (dpMap.get(dp[i]) == null) {
          dpMap.put(dp[i], i);
        } else {
          int preIndex = dpMap.get(dp[i]);
          max = Math.max(max, i - preIndex);
          dpMap.put(dp[i], Math.min(preIndex, i));
        }
      }
    }
    return max;
  }

}
