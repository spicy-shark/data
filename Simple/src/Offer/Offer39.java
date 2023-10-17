package Offer;

public class Offer39 {

  public int majorityElement(int[] nums) {
    int k = nums.length / 2;
    return findK(nums, 0, nums.length - 1, k);
  }

  int findK(int[] nums, int start, int end, int k) {
    int i = start;
    int j = end;
    while (i < j) {
      while (i < j && nums[i] <= nums[start]) {
        i++;
      }
      while (i < j && nums[j] >= nums[start]) {
        j--;
      }
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
    int temp = nums[i];
    nums[i] = nums[start];
    nums[start] = temp;
    if (i == k) {
      return nums[start];
    }
    if (i < k) {
      return findK(nums, i + 1, end, k);
    } else {
      return findK(nums, start, i - 1, k);
    }
  }

}
