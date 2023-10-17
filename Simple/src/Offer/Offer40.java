package Offer;

import java.util.Arrays;

public class Offer40 {

  public int[] getLeastNumbers(int[] arr, int k) {
    if (k >= arr.length) {
      return arr;
    }
    return findK(arr, 0, arr.length - 1, k);
  }

  int[] findK(int[] nums, int start, int end, int k) {
    int i = start;
    int j = end;
    while (i < j) {
      while (i < j && nums[j] >= nums[start]) {
        j--;
      }
      while (i < j && nums[i] <= nums[start]) {
        i++;
      }
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
    int temp = nums[i];
    nums[i] = nums[start];
    nums[start] = temp;
    if (i < k) {
      return findK(nums, i + 1, end, k);
    }
    if (i > k) {
      return findK(nums, start, i - 1, k);
    }
    return Arrays.copyOf(nums, k);
  }

}
