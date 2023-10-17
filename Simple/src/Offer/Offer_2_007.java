package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_2_007 {

  public List<List<Integer>> threeSum(int[] nums) {
//    sort(nums, 0, nums.length - 1);
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cell = null;
    int left;
    int right;
    int sum;
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      left = i + 1;
      right = nums.length - 1;
      while (left < right) {
        sum = nums[i] + nums[left] + nums[right];
        if (sum > 0) {
          right--;
        } else if (sum < 0) {
          left++;
        } else {
          cell = new ArrayList<>();
          cell.add(nums[i]);
          cell.add(nums[left]);
          cell.add(nums[right]);
          res.add(cell);
          left++;
        }
      }
    }
    return res;
  }

  void sort(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }
    if (start == end - 1 && nums[start] <= nums[end]) {
      return;
    }
    int midVal = nums[start];
    int i = start;
    int j = end;
    while (i < j) {
      while (i < j && nums[j] > midVal) {
        j--;
      }
      nums[i] = nums[j];
      while (i < j && nums[i] <= midVal) {
        i++;
      }
      nums[j] = nums[i];
    }
    nums[i] = midVal;
    sort(nums, start, i);
    sort(nums, i + 1, end);
  }

  void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}
