package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    List<Integer> numList = new ArrayList<>();
    if (sum > 0) {
      for (int i = nums.length - 1; i >= 0; i--) {
        if (sum != 0) {
          sum -= nums[i];
        } else {
          numList.add(nums[i]);
        }
      }
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (sum != 0) {
          sum -= nums[i];
        } else {
          numList.add(nums[i]);
        }
      }
    }

    int s = 0;
    int e = nums.length - 1;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cell = null;
    while (s < e) {
      if (sum == 0) {
        if (cell != null) {
          res.add(cell);
        }
        cell = new ArrayList<>();
        sum += nums[s] + nums[e];
        cell.add(nums[s]);
        cell.add(nums[e]);
      }
      if (sum > 0) {
        s++;
        sum += nums[s];
        cell.add(nums[s]);
      }
      if (sum < 0) {
        e--;
        sum += nums[e];
        cell.add(nums[e]);
      }
    }

    return res;
  }
}
