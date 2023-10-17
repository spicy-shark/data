package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam5 {

  /*
  题目：
给出一个排序好的数组和一个数，求数组中连续元素的和等于所给数的子数组
例如：
		int[] num = {1,2,2,3,4,5,6,7,8,9};
        		int sum = 7;
输出：
2,2,3
3,4
7
   */
  public List<List<Integer>> getSubArray(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    int i = 0;
    int j = 0;
    int sum = 0;
    while (i < nums.length && j < nums.length) {
      if (i == j) {
        sum = nums[j];
      }
      while (sum < target) {
        j++;
        sum += nums[j];
      }
      while (sum > target) {
        sum -= nums[i];
        i++;
      }
      if (sum == target) {
        List<Integer> subArray = new ArrayList<>();
        for (int k = i; k <= j; k++) {
          subArray.add(nums[k]);
        }
        if (!subArray.isEmpty()) {
          res.add(subArray);
        }
        j++;
        sum += nums[j];
      }
    }
    return res;
  }

}
